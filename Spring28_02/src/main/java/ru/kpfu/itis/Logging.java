package ru.kpfu.itis;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by Admin on 28.02.2017.
 */
@Aspect
public class Logging {

    private static Logger logger = Logger.getLogger(Logging.class.getName());

    @Pointcut("execution(* ru.kpfu.itis.Developer.*(..))")
    public void allMethods() {
    }

    @Before("allMethods()")
    public void beforeAdvice() {
        logger.info("Before advice");
    }

    @After("allMethods()")
    public void afterAdvice() {
        logger.info("After advice");
    }

    @AfterReturning(pointcut = "allMethods()", returning = "developer")
    public void afterReturningAdvice(Object developer) {
        logger.info("\n Name: Ivan \n Speciality: Python Developer \n Experience: 14");
    }

    @AfterThrowing(pointcut = "allMethods()", throwing = "e")
    public void afterThrowingAdvice(Exception e) {
        logger.info("Exception: " + e.toString());
    }

    @Around("allMethods()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) {
        logger.info("Getting data");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        logger.info("Data is got");
    }
}
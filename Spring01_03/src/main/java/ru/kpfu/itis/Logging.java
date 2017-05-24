package ru.kpfu.itis;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Admin on 01.03.2017.
 */
public class Logging {

        private static Logger logger = Logger.getLogger(ru.kpfu.itis.Logging.class.getName());

        public void allMethods() {
        }

        public void beforeAdvice() {
            logger.info("Before advice");
        }

        public void afterAdvice() {
            logger.info("After advice");
        }

        public void afterReturningAdvice(Object developer) {
            logger.info("\n Name: Ivan \n Speciality: Python Developer \n Experience: 14");
        }

        public void afterThrowingAdvice(Exception e) {
            logger.info("Exception: " + e.toString());
        }

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
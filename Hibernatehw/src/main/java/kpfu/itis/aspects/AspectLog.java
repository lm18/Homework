package kpfu.itis.aspects;

import kpfu.itis.domain.TripEntity;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Admin on 19.04.2017.
 */
public class AspectLog {
    private Logger logger;

    public void getLogger() {
        logger = Logger.getLogger(TripEntity.class.getName());
    }

    public void before() {
        logger.info("Before method...");
    }

    public void after() {
        logger.info("After method.");
    }

    public void afterReturning() {
        logger.info("After returning method");
    }

    public void afterThrowing(Exception e) {
        logger.error("Occurred exception: " + e.getClass());
    }

    public void around(ProceedingJoinPoint joinPoint) {
        logger.info("Around method is started.");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        logger.info("Around method is finished.");
    }
}

package kpfu.itis.aspects;

import kpfu.itis.domain.TripEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Admin on 19.04.2017.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop-config.xml");
        TripEntity tripEntity = (TripEntity) context.getBean("tripEntityBean");
        tripEntity.getType();
        tripEntity.getDeparture();
        tripEntity.getArrival();
    }
}

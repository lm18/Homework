package kpfu.itis.controller;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Admin on 21.04.2017.
 */
public class HomeControllerTest extends HomeController {

    @Test
    public void shouldDisplay() {
        HomeController controller = new HomeController();
        String viewName = controller.homePage();
        System.out.println("Result: " + viewName);
        assertEquals(viewName, "main");
    }
}
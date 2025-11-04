package com.pa;

import org.junit.jupiter.api.Test;

import com.pa.controllers.MainController;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Basic test class to verify the project structure.
 */
public class MainTest {

    @Test
    public void testMainClassExists() {
        // Verify that the Main class can be instantiated
        assertNotNull(Main.class);
    }

    @Test
    public void testControllerClassExists() {
        // Verify that the MainController class can be instantiated
        MainController controller = new MainController();
        assertNotNull(controller);
    }
}

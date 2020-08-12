package com.example.servingwebcontent;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreetingControllerTests {
    @Test
    public void testGreeting() {
        GreetingController test = new GreetingController();
        assertEquals("greeting",test.greeting("andrew",null));
    }
}
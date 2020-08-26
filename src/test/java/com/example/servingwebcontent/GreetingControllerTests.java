package com.example.servingwebcontent;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.yaml.snakeyaml.error.YAMLException;

public class GreetingControllerTests {
    @Test
    public void testGreeting() {
        GreetingController test = new GreetingController();
        assertEquals("greeting",test.greeting("andrew",null));
    }

    @Test
    public void breakableTest(){
        //if x==y
        int x=0;
        int y=0;
        assertEquals(x, y);
    }
}
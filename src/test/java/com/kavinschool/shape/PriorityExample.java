package com.kavinschool.shape;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 20)
    public void testApple() {
        System.out.println("PriorityExample.testApple");
    }

    @Test(priority = -10)
    public void testZebra() {
        System.out.println("PriorityExample.testZebra");
    }

    @Test(priority = 10)
    public void testCobra() {
        System.out.println("PriorityExample.testCobra");
    }



}

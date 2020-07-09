package com.kavinschool.shape;

import org.testng.annotations.Test;

public class InvocationExamples {

    //Execute multiple times the same test case
    @Test(invocationCount = 10)
    public void testInvokeMultipleTimes() {
        System.out.println(Math.floor(Math.random() * 10) + 1);
    }

    //Timeout after 1 second
    @Test(invocationTimeOut = 1000)
    public void testInvokeTimeOut() throws InterruptedException {
        long timeout = (long) (Math.floor(Math.random() * 1000) + 100);
        System.out.println("timeout = " + timeout);
        Thread.sleep(timeout);
    }

    //Allow to execute 10 counts if finished within 1 second
    @Test(invocationCount = 10, invocationTimeOut = 1000)
    public void testInvokeTimeOutMultipleTimes() throws InterruptedException {
        long timeout = (long) (Math.floor(Math.random() * 1000) + 100);
        System.out.println("timeout = " + timeout);
        Thread.sleep(timeout);
    }

    //Allow to execute 10 counts if finished within 5 second
    @Test(invocationCount = 10, invocationTimeOut = 5000)
    public void testInvokeTimeOutMultipleTimesMoreSuccess() throws InterruptedException {
        long timeout = (long) (Math.floor(Math.random() * 1000) + 100);
        System.out.println("timeout = " + timeout);
        Thread.sleep(timeout);
    }
}

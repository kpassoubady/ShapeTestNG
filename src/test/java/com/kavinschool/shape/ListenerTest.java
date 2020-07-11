package com.kavinschool.shape;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerExample.class)
public class ListenerTest {

    @Test(description = "Raptor test")
    public void testRaptor() {
        System.out.println("ListenerTest.testRaptor");
    }

    @Test(/*enabled = false*/)
    public void testTyrannosaurus() {
        System.out.println("ListenerTest.testTyrannosaurus");
    }

    @Test(timeOut = 100)
    public void testStegosaurus() throws InterruptedException {
        System.out.println("ListenerTest.testStegosaurus");
        Thread.sleep(200);
    }

    @Test
    public void testAllosaurus() {
        System.out.println("ListenerTest.testAllosaurus");
        throw new SkipException("Skipping testAllosaurus");
    }

    @Test(successPercentage = 90, invocationCount = 10)
    public void testBrontosaurus() {
        System.out.println("ListenerTest.testBrontosaurus");
        double randNum = Math.random() * 10 + 1;
        Assert.assertTrue(randNum > 5, "Failed with less than or equal to 50");
    }

    @Test(testName = "Test Igunao")
    public void testIguanodone() {
        System.out.println("ListenerTest.testIguanodone");
    }
}

package com.kavinschool.shape;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SampleTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("SampleTest.setUp");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("SampleTest.tearDown");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("SampleTest.beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("SampleTest.afterClass");
    }

    @Test
    public void testFirst() {
        System.out.println("SampleTest.testFirst");
    }

    @Test
    public void testSecond() {
        System.out.println("SampleTest.testSecond");
    }

    @Ignore
    @Test
    public void testThird() {
        System.out.println("SampleTest.testThird");
    }
}

package com.kavinschool.shape;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class OrderTest {

    public OrderTest() {
        System.out.println("OrderTest OrderTest constructor");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("OrderTest @BeforeMethod beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("OrderTest @AfterMethod afterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("OrderTest @BeforeClass beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("OrderTest @AfterClass afterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("OrderTest @BeforeTest beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("OrderTest @AfterTest afterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("OrderTest @BeforeSuite beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("OrderTest @AfterSuite afterSuite");
    }

    @Test
    public void testA() {
        System.out.println("OrderTest @Test testA");
    }

    @Test
    public void testB() {
        System.out.println("OrderTest @Test testB");
    }

    @DataProvider
    public Object[][] dp() {
        System.out.println("OrderTest @DataProvider dp");
        return new Object[][]{new Object[]{1, "a"}, new Object[]{2, "b"},};
    }

    @Test(dataProvider = "dp")
    public void testF(Integer n, String s) {
        System.out.println("OrderTest @Test testF value n=" + n + ", s=" + s);
    }

}

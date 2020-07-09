package com.kavinschool.shape;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AssertExamples {

    @Test
    public void testHardAsserts() {
        Assertion hardAssert = new Assertion();
        hardAssert.assertEquals("Kangs", "Mongs", "Names are not equal");
        hardAssert.assertEquals(2, 5, "Numbers are not equal");
    }

    @Test
    public void testSoftAsserts() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Kangs", "Mongs", "Names are not equal");
        softAssert.assertEquals(2, 5, "Numbers are not equal");
        softAssert.assertAll("Completed All the checks");
    }
}

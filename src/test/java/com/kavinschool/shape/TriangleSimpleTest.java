package com.kavinschool.shape;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Simple test class for Triangle shape
 */
public class TriangleSimpleTest {

    Triangle triangle = new Triangle(3, 4, 5);

    @Test
    public void testArea() {
        System.out.println("testArea");
        double actual = triangle.area();
        double expected = 6.0; // Area of 3-4-5 triangle is 6
        assertEquals(actual, expected, 0.0001);
    }

    @Test
    public void testPerimeter() {
        System.out.println("testPerimeter");
        double actual = triangle.perimeter();
        double expected = 12.0; // 3 + 4 + 5 = 12
        assertEquals(actual, expected);
    }
    
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidTriangle() {
        System.out.println("testInvalidTriangle");
        // This should throw an exception as 1+1 < 3
        new Triangle(1, 1, 3);
    }
}

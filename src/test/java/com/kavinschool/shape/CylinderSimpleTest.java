package com.kavinschool.shape;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Simple test class for Cylinder shape
 */
public class CylinderSimpleTest {

    Cylinder cylinder = new Cylinder(3, 5);

    @Test
    public void testArea() {
        System.out.println("testArea");
        double actual = cylinder.area();
        double expected = 2 * Math.PI * 3 * (3 + 5); // 2πr(r+h)
        assertEquals(actual, expected, 0.0001);
    }

    @Test
    public void testVolume() {
        System.out.println("testVolume");
        double actual = cylinder.volume();
        double expected = Math.PI * 3 * 3 * 5; // πr²h
        assertEquals(actual, expected, 0.0001);
    }

    @Test
    public void testPerimeter() {
        System.out.println("testPerimeter");
        double actual = cylinder.perimeter();
        double expected = 4 * Math.PI * 3; // 4πr
        assertEquals(actual, expected, 0.0001);
    }
    
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidRadius() {
        System.out.println("testInvalidRadius");
        // This should throw an exception as radius must be positive
        new Cylinder(-1, 5);
    }
    
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidHeight() {
        System.out.println("testInvalidHeight");
        // This should throw an exception as height must be positive
        new Cylinder(3, 0);
    }
}

package com.kavinschool.shape;

import org.testng.annotations.*;
import static org.testng.Assert.*;

/**
 *
 * @author Kangeyan Passoubady (Kangs) -
 *         <a href="http://www.kavinschool.com/">Kavin School </a>
 *
 */
public class CylinderDataProviderTest {

    @DataProvider(name = "cylinder-data")
    public Object[][] cylinderData() {
        return new Object[][] { 
            // radius, height, expectedArea, expectedVolume, expectedPerimeter
            { 1.0, 1.0, 2 * Math.PI * 1 * (1 + 1), Math.PI * 1 * 1 * 1, 4 * Math.PI * 1 },
            { 2.0, 3.0, 2 * Math.PI * 2 * (2 + 3), Math.PI * 2 * 2 * 3, 4 * Math.PI * 2 },
            { 3.0, 5.0, 2 * Math.PI * 3 * (3 + 5), Math.PI * 3 * 3 * 5, 4 * Math.PI * 3 },
            { 4.0, 2.0, 2 * Math.PI * 4 * (4 + 2), Math.PI * 4 * 4 * 2, 4 * Math.PI * 4 },
            { 5.0, 10.0, 2 * Math.PI * 5 * (5 + 10), Math.PI * 5 * 5 * 10, 4 * Math.PI * 5 }
        };
    }

    /**
     * Test of area method, of class Cylinder.
     */
    @Test(groups = { "data", "area", "functional" }, dataProvider = "cylinder-data")
    public void testArea(double radius, double height, double expectedArea, double expectedVolume, double expectedPerimeter) {
        System.out.print("testArea");
        System.out.println(" passed values are radius=" + radius + " height=" + height + 
                          " expectedArea=" + expectedArea + " expectedVolume=" + expectedVolume + 
                          " expectedPerimeter=" + expectedPerimeter);
        Cylinder cylinder = new Cylinder(radius, height);
        double result = cylinder.area();
        System.out.println("testArea result: " + result + " Expected: " + expectedArea);
        assertEquals(result, expectedArea, 0.0001);
    }

    /**
     * Test of volume method, of class Cylinder.
     */
    @Test(groups = { "data", "volume", "functional" }, dataProvider = "cylinder-data")
    public void testVolume(double radius, double height, double expectedArea, double expectedVolume, double expectedPerimeter) {
        System.out.print("testVolume");
        System.out.println(" passed values are radius=" + radius + " height=" + height + 
                          " expectedArea=" + expectedArea + " expectedVolume=" + expectedVolume + 
                          " expectedPerimeter=" + expectedPerimeter);
        Cylinder cylinder = new Cylinder(radius, height);
        double result = cylinder.volume();
        System.out.println("testVolume result: " + result + " Expected: " + expectedVolume);
        assertEquals(result, expectedVolume, 0.0001);
    }

    /**
     * Test of perimeter method, of class Cylinder.
     */
    @Test(groups = { "data", "perimeter", "functional" }, dataProvider = "cylinder-data")
    public void testPerimeter(double radius, double height, double expectedArea, double expectedVolume, double expectedPerimeter) {
        System.out.print("testPerimeter");
        System.out.println(" passed values are radius=" + radius + " height=" + height + 
                          " expectedArea=" + expectedArea + " expectedVolume=" + expectedVolume + 
                          " expectedPerimeter=" + expectedPerimeter);
        Cylinder cylinder = new Cylinder(radius, height);
        double result = cylinder.perimeter();
        System.out.println("testPerimeter result: " + result + " Expected: " + expectedPerimeter);
        assertEquals(result, expectedPerimeter, 0.0001);
    }
    
    @DataProvider(name = "invalid-cylinder-data")
    public Object[][] invalidCylinderData() {
        return new Object[][] { 
            // Invalid cylinders with negative or zero dimensions
            { -1.0, 5.0 },
            { 0.0, 5.0 },
            { 3.0, -2.0 },
            { 3.0, 0.0 }
        };
    }
    
    /**
     * Test for invalid cylinder creation.
     */
    @Test(groups = { "data", "exceptions" }, dataProvider = "invalid-cylinder-data", 
          expectedExceptions = IllegalArgumentException.class)
    public void testInvalidCylinder(double radius, double height) {
        System.out.println("testInvalidCylinder with radius: " + radius + ", height: " + height);
        new Cylinder(radius, height);
    }
}

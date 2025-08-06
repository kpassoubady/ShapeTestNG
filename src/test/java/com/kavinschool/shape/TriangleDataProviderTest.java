package com.kavinschool.shape;

import org.testng.annotations.*;
import static org.testng.Assert.*;

/**
 *
 * @author Kangeyan Passoubady (Kangs) -
 *         <a href="http://www.kavinschool.com/">Kavin School </a>
 *
 */
public class TriangleDataProviderTest {

    @DataProvider(name = "triangle-data")
    public Object[][] triangleData() {
        return new Object[][] { 
            // sideA, sideB, sideC, expectedArea, expectedPerimeter
            { 3.0, 4.0, 5.0, 6.0, 12.0 },           // Right triangle
            { 5.0, 5.0, 5.0, 10.825, 15.0 },        // Equilateral triangle
            { 5.0, 5.0, 8.0, 12.0, 18.0 },          // Isosceles triangle
            { 7.0, 8.0, 9.0, 26.833, 24.0 },        // Scalene triangle
            { 13.0, 14.0, 15.0, 84.0, 42.0 }        // Larger triangle
        };
    }

    /**
     * Test of area method, of class Triangle.
     */
    @Test(groups = { "data", "area", "functional" }, dataProvider = "triangle-data")
    public void testArea(double sideA, double sideB, double sideC, double expectedArea, double expectedPerimeter) {
        System.out.print("testArea");
        System.out.println(" passed values are sideA=" + sideA + " sideB=" + sideB + 
                          " sideC=" + sideC + " expectedArea=" + expectedArea + 
                          " expectedPerimeter=" + expectedPerimeter);
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        double result = triangle.area();
        System.out.println("testArea result: " + result + " Expected: " + expectedArea);
        assertEquals(result, expectedArea, 0.001);
    }

    /**
     * Test of perimeter method, of class Triangle.
     */
    @Test(groups = { "data", "perimeter", "functional" }, dataProvider = "triangle-data")
    public void testPerimeter(double sideA, double sideB, double sideC, double expectedArea, double expectedPerimeter) {
        System.out.print("testPerimeter");
        System.out.println(" passed values are sideA=" + sideA + " sideB=" + sideB + 
                          " sideC=" + sideC + " expectedArea=" + expectedArea + 
                          " expectedPerimeter=" + expectedPerimeter);
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        double result = triangle.perimeter();
        System.out.println("testPerimeter result: " + result + " Expected: " + expectedPerimeter);
        assertEquals(result, expectedPerimeter, 0.0);
    }
    
    @DataProvider(name = "invalid-triangle-data")
    public Object[][] invalidTriangleData() {
        return new Object[][] { 
            // Invalid triangles where sum of two sides <= third side
            { 1.0, 1.0, 3.0 },
            { 2.0, 7.0, 3.0 },
            { 0.0, 5.0, 5.0 },
            { -1.0, 4.0, 5.0 }
        };
    }
    
    /**
     * Test for invalid triangle creation.
     */
    @Test(groups = { "data", "exceptions" }, dataProvider = "invalid-triangle-data", 
          expectedExceptions = IllegalArgumentException.class)
    public void testInvalidTriangle(double sideA, double sideB, double sideC) {
        System.out.println("testInvalidTriangle with sides: " + sideA + ", " + sideB + ", " + sideC);
        new Triangle(sideA, sideB, sideC);
    }
}

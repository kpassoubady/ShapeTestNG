package com.kavinschool.shape;

import org.testng.annotations.*;
import static org.testng.Assert.*;

/**
 *
 * @author Kangeyan Passoubady (Kangs) -
 *         <a href="http://www.kavinschool.com/">Kavin School </a>
 *
 */
public class RectangleParameterTest {

	Rectangle rectangle;

	@Parameters({ "RectangleLength", "RectangleBreadth" })
	@BeforeTest(alwaysRun = true)
	public void setUp(int l, int b) {
		System.out.println("RectangleTest @BeforeMethod setup");
		rectangle = new Rectangle(l, b);

	}

	@AfterTest(alwaysRun = true)
	public void tearDown() {
		System.out.println("After tear down");
		rectangle = null;
	}

	/**
	 * Test of perimeter method, of class Rectangle.
	 */
	@Parameters({ "RectanglePerimeterExpResult" })
	@Test(groups = { "functional", "perimeter" })
	public void testPerimeter(double p_expResult) {
		System.out.println("testPerimeter parameter:" + p_expResult);
		double expResult = p_expResult;
		double result = rectangle.perimeter();
		assertEquals(expResult, result, 0.0);
	}

	/**
	 * Test of area method, of class Rectangle.
	 */
	@Parameters({ "RectangleAreaExpResult" })
	@Test(groups = { "functional", "area" })
	public void testArea(double p_expResult) {
		System.out.println("testArea paramter:" + p_expResult);
		double expResult = p_expResult;
		double result = rectangle.area();
		assertEquals(expResult, result, 0.0);
	}
}

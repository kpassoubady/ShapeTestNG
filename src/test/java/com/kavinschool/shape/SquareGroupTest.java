
package com.kavinschool.shape;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author Kangeyan Passoubady (Kangs) -
 *         <a href="http://www.kavinschool.com/">Kavin School </a>
 *
 */
public class SquareGroupTest {

	Square instance;
	double side;
	double expResultArea, expResultPerimeter;

	@BeforeTest(alwaysRun=true)
	public void setUpGroupsFunctional() {
		System.out.println("SquareTest @BeforeGroups setUpGroups functional");
		side = 2.0;
		instance = new Square(side);
		expResultArea = 4.0;
		expResultPerimeter = 8.0;
		System.out.println(
				"Side: " + side + " expResultArea: " + expResultArea + " expResultPerimeter: " + expResultPerimeter);
	}

	@AfterTest(alwaysRun=true)
	public void tearDownGroupsFunctional() {
		System.out.println("SquareTest @AfterGroups tearDownGroups functional");
		instance = null;
	}

	/**
	 * Test of perimeter method, of class Square.
	 */
	@Test(groups = { "functional", "perimeter" })
	public void testPerimeter() {
		System.out.println("X===============>testPerimeter Starts<===============X");
		double result = instance.perimeter();
		assertEquals(expResultPerimeter, result, 0.0);
		System.out.println("Side: " + side + " expResultPerimeter: " + expResultPerimeter + " ActualResult: " + result);
		System.out.println("X===============>testPerimeter Ends<=================X");

	}

	/**
	 * Test of area method, of class Square.
	 */
	@Test(groups = { "functional", "area" })
	public void testArea() {
		System.out.println("X===============>testArea Starts<===============X");
		double result = instance.area();
		assertEquals(expResultArea, result, 0.0);
		System.out.println("Side: " + side + " expResultArea: " + expResultArea + " ActualResult: " + result);
		System.out.println("X===============>testArea Ends<=================X");
	}

}

package com.kavinschool.shape;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author Kangeyan Passoubady (Kangs) -
 *         <a href="http://www.kavinschool.com/">Kavin School </a>
 *
 */
public class CubeMultipleDataProviderTest {

	@DataProvider(name = "cube-area")
	public Object[][] DataSet1() {

		return new Object[][] { { 5, 150.0 }, { 10, 600.0 }, { 15, 1350.0 }, { 20, 2400.0 }, { 25, 3750.0 } };
	}

	@DataProvider(name = "cube-volume")
	public Object[][] DataSet2() {

		return new Object[][] { { 5, 125.0 }, { 10, 1000.0 }, { 15, 3375.0 }, { 20, 8000.0 }, { 25, 15625.0 } };
	}

	@DataProvider(name = "cube-perimeter")
	public Object[][] DataSet3() {

		return new Object[][] { { 5, 60.0 }, { 10, 120.0 }, { 15, 180.0 }, { 20, 240.0 }, { 25, 300.0 } };
	}

	/**
	 * Test of area method, of class Cube.
	 */
	@Test(groups = { "data", "area", "functional" }, dataProvider = "cube-area")
	public void testArea(int input, double AreaExpected) {
		System.out.print("testArea");
		System.out.println(" passed values are side=" + input + " AreaExpected=" + AreaExpected);

		Cube cube = new Cube(input);
		double result = cube.area();
		System.out.println("testArea result :" + result + " Expected: " + AreaExpected);
		assertEquals(AreaExpected, result, 0.0);
	}

	/**
	 * Test of volume method, of class Cube.
	 */
	@Test(groups = { "data", "volume", "functional" }, dataProvider = "cube-volume")
	public void testVolume(int input, double VolumeExpected) {
		System.out.print("testVolume");
		System.out.println(" passed values are side=" + input + " VolumeExpected=" + VolumeExpected);

		Cube cube = new Cube(input);
		double result = cube.volume();
		System.out.println("testVolume result :" + result + " Expected: " + VolumeExpected);
		assertEquals(VolumeExpected, result, 0.0);
	}

	/**
	 * Test of perimeter method, of class Cube.
	 */
	@Test(groups = { "data", "perimeter", "functional" }, dataProvider = "cube-perimeter", invocationTimeOut = 30)
	public void testPerimeter(int input, double PerimeterExpected) {
		System.out.print("testPerimeter");
		System.out.println(" passed values are side=" + input + " PerimeterExpected=" + PerimeterExpected);

		Cube cube = new Cube(input);
		double result = cube.perimeter();
		System.out.println("testPerimeter result :" + result + " Expected: " + PerimeterExpected);
		assertEquals(PerimeterExpected, result, 0.0);

	}
}

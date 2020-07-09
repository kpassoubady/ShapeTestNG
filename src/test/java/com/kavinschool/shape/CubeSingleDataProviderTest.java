package com.kavinschool.shape;

import org.testng.annotations.*;
import static org.testng.Assert.*;

/**
 *
 * @author Kangeyan Passoubady (Kangs) -
 *         <a href="http://www.kavinschool.com/">Kavin School </a>
 *
 */
public class CubeSingleDataProviderTest {

	@DataProvider(name = "cube-data")
	public Object[][] rangeData() {

		return new Object[][] { 
			{ 5, 150.0, 125.0, 60.0 }, 
			{ 10, 600.0, 1000.0, 120.0 }, 
			{ 15, 1350.0, 3375.0, 180.0 },
			{ 20, 2400.0, 8000.0, 240.0 }, 
			{ 25, 3750.0, 15625.0, 300.0 } 
		};
	}

	/**
	 * Test of area method, of class Cube.
	 */
	@Test(groups = { "data", "area", "functional" }, dataProvider = "cube-data")
	public void testArea(int input, double AreaExpected, double VolumeExpected, double PerimeterExpected) {
		System.out.print("testArea");
		System.out.println(" passed values are side=" + input+" AreaExpected="
		+AreaExpected+" VolumeExpected="+VolumeExpected+" PerimeterExpected="+PerimeterExpected);
		Cube cube = new Cube(input);
		double result = cube.area();
		System.out.println("testArea result :" + result + " Expected: " + AreaExpected);
		assertEquals(AreaExpected, result, 0.0);
	}

	/**
	 * Test of volume method, of class Cube.
	 */
	@Test(groups = { "data", "volume", "functional" }, dataProvider = "cube-data")
	public void testVolume(int input, double AreaExpected, double VolumeExpected, double PerimeterExpected) {
		System.out.print("testVolume");
		System.out.println(" passed values are side=" + input+" AreaExpected="
		+AreaExpected+" VolumeExpected="+VolumeExpected+" PerimeterExpected="+PerimeterExpected);
		Cube cube = new Cube(input);
		double result = cube.volume();
		System.out.println("testVolume result :" + result + " Expected: " + VolumeExpected);
		assertEquals(VolumeExpected, result, 0.0);
	}

	/**
	 * Test of perimeter method, of class Cube.
	 */
	@Test(groups = { "data", "perimeter", "functional" }, dataProvider = "cube-data")
	public void testPerimeter(int input, double AreaExpected, double VolumeExpected, double PerimeterExpected) {
		System.out.print("testPerimeter");
		System.out.println(" passed values are side=" + input+" AreaExpected="
		+AreaExpected+" VolumeExpected="+VolumeExpected+" PerimeterExpected="+PerimeterExpected);
		Cube cube = new Cube(input);
		double result = cube.perimeter();
		System.out.println("testPerimeter result :" + result + " Expected: " + PerimeterExpected);
		assertEquals(PerimeterExpected, result, 0.0);
	}
}

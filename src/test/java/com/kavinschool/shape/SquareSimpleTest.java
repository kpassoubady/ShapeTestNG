package com.kavinschool.shape;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SquareSimpleTest {

	Square square = new Square(8);

	@Test
	public void testArea() {
		System.out.println("testArea");
		double actual = square.area();
		double expected = 64;
		assertEquals(actual, expected);
		
	}

	@Test
	public void testPerimeter() {
		System.out.println("testPerimeter");
		double actual = square.perimeter();
		double expected = 32;
		assertEquals(actual, expected);
	}
}

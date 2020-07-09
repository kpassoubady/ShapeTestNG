package com.kavinschool.shape;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class RectanglePlusGroupsOfGroupsTest {
	RectanglePlus rectanglePlus = new RectanglePlus(4, 7, ShapeRainbowColor.GREEN, "sudha");

	/**
	 * Test of getShapeLabel method, of class Rectangle.
	 */
	@Test(groups = { "non-functional", "Getter", "ignore" })
	public void testGetShapeLabel() {
		System.out.println("getShapeLabel");
		String expResult = "sudha";
		String result = rectanglePlus.getShapeLabel();
		assertEquals(expResult, result);
	}

	/**
	 * Test of draw method, of class Rectangle.
	 */
	@Test(groups = { "non-functional", "print", "ignore" })
	public void testDraw() {
		System.out.println("testDraw");

		rectanglePlus.draw();
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getColorName method, of class Rectangle.
	 */
	@Test(groups = { "non-functional", "Getter", "ignore" })
	public void testGetColorName() {
		System.out.println("testGetColorName");
		int expResult = 2;
		int result = rectanglePlus.getColorName();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setColorName method, of class Rectangle.
	 */
	@Test(groups = { "non-functional", "Setter", "ignore" })
	public void testSetColorName() {
		System.out.println("testSetColorName");
		int ShapeColor = ShapeRainbowColor.VIOLET;
		rectanglePlus.setColorName(ShapeColor);
		assertEquals(rectanglePlus.getColorName(), ShapeColor);
	}

	/**
	 * Test of resetColor method, of class Rectangle.
	 */
	@Test(groups = { "non-functional", "Resetter", "ignore" })
	public void testResetColor() {
		System.out.println("testResetColor");
		rectanglePlus.resetColor();
		assertEquals(rectanglePlus.getColorName(), 0);
	}

	/**
	 * Test of setShapeLabel method, of class Rectangle.
	 */
	@Test(groups = { "non-functional", "Setter", "ignore" })
	public void testSetShapeLabel() {
		System.out.println("testSetShapeLabel");
		String ShapeLabel = "World is good";
		rectanglePlus.setShapeLabel(ShapeLabel);
		assertEquals(rectanglePlus.getShapeLabel(), ShapeLabel);
	}

	/**
	 * Test of resetLabel method, of class Rectangle.
	 */
	@Test(groups = { "non-functional", "Resetter", "ignore" })
	public void testResetLabel() {
		System.out.println("testResetLabel");
		rectanglePlus.resetLabel();
		assertEquals(rectanglePlus.getShapeLabel(), "");
	}
}

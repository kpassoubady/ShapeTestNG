package com.kavinschool.shape;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author Kangeyan Passoubady (Kangs) - <a href="http://www.kavinschool.com/">Kavin School </a>
 *
 */
public class CircleExpectedExceptionsTest {

	CirclePlus instance;
    private double CircleRadius;
    private int CircleColor;
    private String CircleLabel;


    @BeforeTest(alwaysRun = true)
    public void BetaSetUpTest() throws Exception {
        CircleLabel = "Welcome to TestNG";
        CircleColor = 4;
        CircleRadius = 13;
        instance = new CirclePlus(CircleRadius, CircleColor, CircleLabel);
        System.out.println("CircleTest @BeforeTest BetaSetUpTest");
    }

    @AfterTest(alwaysRun = true)
    public void BetaTearDownTest() {
        CircleLabel = null;
        instance = null;
        CircleRadius = 0;
        CircleColor = 0;
        System.out.println("CircleTest @AfterTest BetaTearDownTest");
    }

    /**
     * Test of perimeter method, of class Circle.
     */
    @Test(groups = {"functional", "perimeter"})
    public void testPerimeter() {
        System.out.println("CircleTest perimeter");
        double expResult = 81.68;
        double result = instance.perimeter();
        assertEquals(expResult, result, 0.5);
    }

    /**
     * Test of area method, of class Circle.
     */
    @Test(groups = {"functional", "area"})
    public void testArea() {
        System.out.println("CircleTest area");
        double expResult = 530.92;
        double result = instance.area();
        assertEquals(expResult, result, 0.5);
    }

    /**
     * Test of getColorName method, of class Circle.
     */
    @Test(groups = {"non-functional", "Getter", "ignore"})
    public void testGetColorName() {
        System.out.println("CircleTest getColorName");
        int expResult = CircleColor;
        int result = instance.getColorName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setColorName method, of class Circle.
     * @throws ColorRangeException is thrown
     */
    @Test(groups = {"exceptions"}, expectedExceptions = ColorRangeException.class )
    public void testSetColorName() throws ColorRangeException {
        System.out.println("CircleTest setColorName");
        int expResult = -CircleColor;
        instance.setColorName(-CircleColor);
        int result = instance.getColorName();
        assertEquals(expResult, result);
    }

    /**
     * Test of resetColor method, of class Circle.
     */
    @Test(groups = {"non-functional", "Resetter", "ignore"})
    public void testResetColor() {
        System.out.println("CircleTest resetColor");
        instance.resetColor();
        int expResult = 0;
        int result = instance.getColorName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setShapeLabel method, of class Circle.
     */
    @Test(groups = {"non-functional", "Setter", "ignore"})
    public void testSetShapeLabel() {
        System.out.println("CircleTest setShapeLabel");
        String expResult = CircleLabel;
        instance.setShapeLabel(CircleLabel);
        String result = instance.getShapeLabel();
        assertEquals(expResult, result);
    }

    /**
     * Test of getShapeLabel method, of class Circle.
     */
    @Test(groups = {"non-functional", "Getter", "ignore"})
    public void testGetShapeLabel() {
        System.out.println("CircleTest getShapeLabel");
        String expResult = CircleLabel;
        String result = instance.getShapeLabel();
        assertEquals(expResult, result);
        assertTrue(expResult.equalsIgnoreCase(CircleLabel));
    }

    /**
     * Test of resetLabel method, of class Circle.
     */
    @Test(groups = {"non-functional", "Resetter", "ignore"})
    public void testResetLabel() {
        System.out.println("CircleTest resetLabel");
        instance.resetLabel();
        String expResult = "";
        String result = instance.getShapeLabel();
        assertEquals(expResult, result);
    }
}

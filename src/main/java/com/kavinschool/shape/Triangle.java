/*
 * Kangeyan Passoubady
 * (c) Kavin School -2015
 */
package com.kavinschool.shape;

/**
 * The Class Triangle.
 */
public class Triangle extends Shape2D {

    /** The sides of the triangle. */
    double sideA, sideB, sideC;
    
    /** The Constant NAME. */
    static final String NAME = "Triangle";

    /**
     * Instantiates a new triangle.
     *
     * @param a the first side
     * @param b the second side
     * @param c the third side
     */
    Triangle(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            throw new IllegalArgumentException("Invalid triangle sides: The sum of any two sides must be greater than the third side");
        }
        
        sideA = a;
        sideB = b;
        sideC = c;

        count();
        count2D();
        this.assignUniqueID();
    }
    
    /**
     * Checks if the given sides can form a valid triangle.
     * According to the triangle inequality theorem, the sum of the lengths of any two sides
     * must be greater than the length of the remaining side.
     *
     * @param a the first side
     * @param b the second side
     * @param c the third side
     * @return true if the sides can form a valid triangle, false otherwise
     */
    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape#perimeter()
     */
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape#area()
     */
    public double area() {
        // Using Heron's formula to calculate area
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape#draw()
     */
    public void draw() {
        System.out.println("Name: " + NAME);
        System.out.println("Type: " + type);
        System.out.println("ID: " + id);
        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Side C: " + sideC);
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape#count()
     */
    protected void count() {
        Shape2D.totalShapes++;
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape2D#count2D()
     */
    protected void count2D() {
        Triangle.total2dShapes++;
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape#assignUniqueID()
     */
    protected void assignUniqueID() {
        id = Shape.totalShapes * 10000;
    }
}

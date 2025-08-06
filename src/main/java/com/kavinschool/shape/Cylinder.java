/*
 * Kangeyan Passoubady
 * (c) Kavin School -2015
 */
package com.kavinschool.shape;

/**
 * The Class Cylinder.
 */
public class Cylinder extends Shape3D {

    /** The radius and height. */
    double radius, height;
    
    /** The Constant NAME. */
    static final String NAME = "Cylinder";

    /**
     * Instantiates a new cylinder.
     *
     * @param r the radius
     * @param h the height
     */
    Cylinder(double r, double h) {
        if (r <= 0 || h <= 0) {
            throw new IllegalArgumentException("Radius and height must be positive values");
        }
        
        radius = r;
        height = h;

        count();
        count3D();
        assignUniqueID();
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape#area()
     */
    public double area() {
        // Surface area = 2πr² + 2πrh = 2πr(r + h)
        return 2 * Math.PI * radius * (radius + height);
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape3D#volume()
     */
    public double volume() {
        // Volume = πr²h
        return Math.PI * radius * radius * height;
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape#perimeter()
     */
    public double perimeter() {
        // Perimeter of the two circular ends
        return 4 * Math.PI * radius;
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape#draw()
     */
    public void draw() {
        System.out.println("Name: " + NAME);
        System.out.println("Type: " + type);
        System.out.println("ID: " + id);
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape#count()
     */
    protected void count() {
        Shape3D.totalShapes++;
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape3D#count3D()
     */
    protected void count3D() {
        Cylinder.total3dShapes++;
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape#assignUniqueID()
     */
    protected void assignUniqueID() {
        id = Shape.totalShapes * 10000;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#finalize()
     */
    @Override
    protected void finalize() {
        System.out.println("Finalizing " + id);
    }
}

/*
 * Kangeyan Passoubady
 * (c) Kavin School -2015
 */
package com.kavinschool.shape;

/**
 * The Class Cone.
 */
public class Cone extends Shape3D {

    /** The height. */
    double height;

    /** The side. */
    double side;

    /** The radius. */
    double radius;

    /** The Constant NAME. */
    static final String NAME = "Cone";

    /**
     * Instantiates a new cone.
     *
     * @param s the s
     * @param r the r
     * @param h the h
     */
    Cone(int s, int r, int h) {
        side = s;
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
        return Math.PI * side * radius;
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape#perimeter()
     */
    public double perimeter() {
        return Math.PI * radius * radius + Math.PI * radius * Math.sqrt(radius * radius + height * height);
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape3D#volume()
     */
    public double volume() {
        return (Math.PI * radius * radius * height) / 3;
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape#draw()
     */
    public void draw() {
        System.out.println("Name:" + NAME);
        System.out.println("Type: " + type);
        System.out.println("ID: " + id);
        System.out.println("Side: " + side);
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
        Cone.total3dShapes++;
    }

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape#assignUniqueID()
     */
    protected void assignUniqueID() {
        id = Shape.totalShapes * 10000;
    }

}

/*
 * Kangeyan Passoubady
 * (c) Kavin School -2015
 */
package com.kavinschool.shape;

/**
 * The Class Cube.
 */
public class Cube extends Shape3D {

	   /** The side. */
   	double side;
	    
    	/** The Constant NAME. */
    	static final String NAME = "Cube";

	    /**
    	 * Instantiates a new cube.
    	 *
    	 * @param s the s
    	 */
    	Cube(int s) {
	        side = s;
	        count();
	        count3D();
	        assignUniqueID();
	    }

	    /* (non-Javadoc)
    	 * @see com.kavinschool.shape.Shape#area()
    	 */
    	public double area() {
	        return 6 * side * side;
	    }

	    /* (non-Javadoc)
    	 * @see com.kavinschool.shape.Shape3D#volume()
    	 */
    	public double volume() {
	        return side * side * side;
	    }

	    /* (non-Javadoc)
    	 * @see com.kavinschool.shape.Shape#perimeter()
    	 */
    	public double perimeter() {
	        return 12 * side;
	    }

	    /* (non-Javadoc)
    	 * @see com.kavinschool.shape.Shape#draw()
    	 */
    	public void draw() {
	        System.out.println("Name:" + NAME);
	        System.out.println("Type: " + type);
	        System.out.println("ID: " + id);
	        System.out.println("Side: " + side);
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
	        Cube.total3dShapes++;
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

/*
 * Kangeyan Passoubady
 * (c) Kavin School -2015
 */
package com.kavinschool.shape;

/**
 * The Class Shape2D.
 */
public abstract class Shape2D extends Shape {

    /** The total2d shapes. */
    static int total2dShapes = 0;
    
    /** The Constant NAME. */
    static final String NAME = "2D Shape";
    
    /** The type. */
    protected String type = "2D";

    /**
     * Count2 d.
     */
    abstract protected void count2D();

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape#toString()
	 */
	@Override
	public String toString() {
		return "Shape2D [type=" + type + "]";
	}
    
    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape#printMe()
     */
    public void printMe() {
    	super.printMe();
    	System.out.println("My name is :" + Shape2D.NAME);
    }

}

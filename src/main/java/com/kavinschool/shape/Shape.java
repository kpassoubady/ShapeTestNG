/*
 * Kangeyan Passoubady
 * (c) Kavin School -2015
 */
package com.kavinschool.shape;

/**
 * The Class Shape.
 */
public abstract  class Shape {
    
    /**
     * The total shapes.
     *
     * @serial holds the total number of shapes object created. Note this will contain total of both Shape2D and Shape3D objects.
     */
    static int totalShapes = 0;
    
    /**
     * The Constant NAME.
     *
     */
    static final String NAME = "Shape";
    
    
    /** The type. */
    protected String type = "Abstract";

    /** The id. */
    /*
     * @serial holds the unique id of objects. This value should be unique for both Shape2D and Shape3D objects.
     */
    protected double id;

    /**
     * Area.
     *
     * @return the double
     */
    abstract public double area();

    /**
     * Perimeter.
     *
     * @return the double
     */
    abstract public double perimeter();

    /**
     * Draw.
     */
    /*
     * This method displays the instance attributes information
     *
     */
    abstract public void draw();

    /**
     * Count.
     */
    abstract protected void count();

    /**
     * Assign unique id.
     */
    abstract protected void assignUniqueID();
    
    /**
     * Prints the me.
     */
    public void printMe() {
    	System.out.println("My name is :" + Shape.NAME);
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Shape [type=" + type + ", id=" + id + "]";
	}
    
    

}

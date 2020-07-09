/*
 * Kangeyan Passoubady
 * (c) Kavin School -2015
 */
package com.kavinschool.shape;

/**
 * The Class Shape3D.
 */
public abstract class Shape3D extends Shape {

	/** The total3d shapes. */
	static int total3dShapes = 0;
	
	/** The Constant NAME. */
	static final String NAME = "3D Shape";
	
	/** The type. */
	protected String type = "3D";

	/**
	 * Volume.
	 *
	 * @return the double
	 */
	abstract public double volume();

	/**
	 * Count3 d.
	 */
	abstract protected void count3D();
}

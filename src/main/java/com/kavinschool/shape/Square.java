/*
 * Kangeyan Passoubady
 * (c) Kavin School -2015
 */
package com.kavinschool.shape;

/**
 * The Class Square.
 */
@About(description = "This is a concrete class subclassed from Shape2D")
public class Square extends Shape2D {

	/** The side. */
	private final double side;

	/**
	 * Instantiates a new square.
	 *
	 * @param s the s
	 */
	public Square(double s) {
		super();
		side = s;
		this.count();
		this.count2D();
		this.assignUniqueID();
	}

	/** The Constant NAME. */
	static final String NAME = "Square";

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape#perimeter()
	 */
	public double perimeter() {
		return 4 * side;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape#area()
	 */
	public double area() {
		return side * side;
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
		Square.totalShapes++;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape2D#count2D()
	 */
	protected void count2D() {
		Shape2D.total2dShapes++;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape#assignUniqueID()
	 */
	protected void assignUniqueID() {
		id = Shape.totalShapes * 10000;
	}

}

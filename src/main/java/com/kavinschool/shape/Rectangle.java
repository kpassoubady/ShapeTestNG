/*
 * Kangeyan Passoubady
 * (c) Kavin School -2015
 */
package com.kavinschool.shape;

/**
 * The Class Rectangle.
 */
public class Rectangle extends Shape2D {

	/** The breadth. */
	int length, breadth;
	
	/** The Constant NAME. */
	static final String NAME = "Rectangle";

	/**
	 * Instantiates a new rectangle.
	 *
	 * @param l the l
	 * @param b the b
	 */
	Rectangle(int l, int b) {
		length = l;
		breadth = b;

		count();
		count2D();
		this.assignUniqueID();
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape#perimeter()
	 */
	public double perimeter() {
		return 2 * length + 2 * breadth;
	}

	/**
	 * Finds the circumference of a Rectangle.
	 *
	 * @return the double
	 * @deprecated Not for public use. This method is expected to be retained
	 *             only as a package private method. Replaced by
	 *             {@link #perimeter}
	 */
	@SuppressWarnings("unused")
	@Deprecated
	private double circumference() {
		return 2 * length + 2 * breadth;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape#area()
	 */
	public double area() {
		return length * breadth;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape#draw()
	 */
	public void draw() {
		System.out.println("Name: :" + NAME);
		System.out.println("Type: " + type);
		System.out.println("ID: " + id);
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
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
		Rectangle.total2dShapes++;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape#assignUniqueID()
	 */
	protected void assignUniqueID() {
		id = Shape.totalShapes * 10000;
	}

}

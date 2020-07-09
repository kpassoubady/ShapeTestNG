/*
  @author: Kangeyan Passoubady
 * (c) - Kavin School
 * This is a concrete class created from Shape2D
 */

package com.kavinschool.shape;

/**
 * The Class Circle.
 */
public class Circle extends Shape2D {

	/** The radius. */
	double radius;
	
	/** The Constant NAME. */
	static final String NAME = "Circle";

	/**
	 * Instantiates a new circle.
	 *
	 * @param r the r
	 */
	Circle(int r) {
		radius = r;

		count();
		count2D();
		assignUniqueID();

	}

	/**
	 * Instantiates a new circle.
	 *
	 * @param radius the radius
	 */
	public Circle(double radius) {
		this.radius = radius;

		count();
		count2D();
		assignUniqueID();
	}

	/**
	 * Finds the circumference of a Circle.
	 *
	 * @return circumference of the circle
	 * @deprecated Not for public use. This method is expected to be retained
	 *             only as a package private method. Replaced by
	 *             {@link #perimeter}
	 */

	@SuppressWarnings("unused")
	@Deprecated
	private double circumference() {
		return 2 * Math.PI * radius;
	}

	/**
	 * Perimeter.
	 *
	 * @return Returns perimeter of a circle
	 */
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}


	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Name:" + NAME);
		System.out.println("Type: " + type);
		System.out.println("ID: " + id);
		System.out.println("Radius: " + radius);
	}

	/**
	 * Draw.
	 *
	 * @param deep            - accepts boolean value. If true prints area and perimeter
	 *            values
	 */
	public void draw(boolean deep) {
		this.draw();
		if (deep) {
			System.out.println("Area: " + area());
			System.out.println("Perimeter: " + perimeter());
		}
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
		Circle.total2dShapes++;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape#assignUniqueID()
	 */
	protected void assignUniqueID() {
		id = Shape.totalShapes * 10000;
	}

    /* (non-Javadoc)
     * @see com.kavinschool.shape.Shape2D#printMe()
     */
    public void printMe() {
    	super.printMe();
    	System.out.println("My name is :" + Circle.NAME);
    }
}

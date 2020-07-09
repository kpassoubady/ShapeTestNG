/*
 * Kangeyan Passoubady
 * (c) Kavin School -2015
 */
package com.kavinschool.shape;

/**
 * The Class CirclePlus.
 */
public class CirclePlus extends Circle implements ShapeColor, ShapeLabel {

	/** The Constant NAME. */
	static final String NAME = "CirclePlus";

	/** The Color. */
	private int Color;
	
	/** The Label. */
	private String Label;

	/**
	 * Instantiates a new circle plus.
	 *
	 * @param r the r
	 */
	CirclePlus(int r) {
		super(r);
	}

	/**
	 * Instantiates a new circle plus.
	 *
	 * @param radius the radius
	 * @param CircleColor the circle color
	 * @param CircleLabel the circle label
	 * @throws ColorRangeException the color range exception
	 */
	CirclePlus(double radius, int CircleColor, String CircleLabel) throws ColorRangeException {
		super(radius);
		setShapeLabel(CircleLabel);
		setColorName(CircleColor);
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.ShapeColor#getColorName()
	 */
	public int getColorName() {
		return Color;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.ShapeColor#setColorName(int)
	 */
	public void setColorName(int ColorName) throws ColorRangeException {
		Color = ColorName;
		if (Color < 0 || Color > 255)
			throw new ColorRangeException("An out of range color value was specified");
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.ShapeColor#resetColor()
	 */
	public void resetColor() {
		Color = 0;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.ShapeLabel#setShapeLabel(java.lang.String)
	 */
	public void setShapeLabel(String ShapeLabel) {
		Label = ShapeLabel;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.ShapeLabel#getShapeLabel()
	 */
	public String getShapeLabel() {
		return Label;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.ShapeLabel#resetLabel()
	 */
	public void resetLabel() {
		Label = "";
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Circle#draw()
	 */
	public void draw() {
		super.draw();
		System.out.println("Label: " + Label);
		System.out.println("Color: " + Color);
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Circle#draw(boolean)
	 */
	public void draw(boolean deep) {
		this.draw();
		if (deep) {
			System.out.println("Area: " + super.area());
			System.out.println("Perimerter: " + super.perimeter());
		}

	}
}

/*
 * Kangeyan Passoubady
 * (c) Kavin School -2015
 */
package com.kavinschool.shape;

/**
 * The Class DemoShape.
 */
public class DemoShape {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		System.out.println("Welcome to Shape Project");
		
		Square square1 = new Square(5);
		Square square2 = new Square(10);
		
		square1.draw();
		System.out.println("Area of Square1:" + square1.area());
		System.out.println("Perimeter of Square1:" + square1.perimeter());
		System.out.println("====================================================");
		
		square2.draw();
		System.out.println("Area of Square2:" + square2.area());
		System.out.println("Perimeter of Square2:" + square2.perimeter());
		
		System.out.println("====================================================");
		
		Cube cube1 = new Cube(4);
		cube1.draw();
		System.out.println("Area of Cube1:" + cube1.area());
		System.out.println("Perimeter of Cube1:" + cube1.perimeter());
		System.out.println("Volume of Cube1:" + cube1.volume());
		System.out.println("====================================================");

		Cone cone1 = new Cone(4,5,6);
		cone1.draw();
		System.out.println("Area of Cone1:" + cone1.area());
		System.out.println("Perimeter of Cone1:" + cone1.perimeter());
		System.out.println("Volume of Cone1:" + cone1.volume());
		System.out.println("====================================================");
	
		Rectangle rectangle1 = new Rectangle(10,12);
		rectangle1.draw();
		System.out.println("Area of Rectangle1:" + rectangle1.area());
		System.out.println("Perimeter of Rectangle1:" + rectangle1.perimeter());
		System.out.println("====================================================");
	
		Circle circle1 = new Circle(7);
		circle1.draw();
		System.out.println("Area of Circle1:" + circle1.area());
		System.out.println("Perimeter of Circle1:" + circle1.perimeter());
		System.out.println("====================================================");
	
		Cuboid cuboid1 = new Cuboid(4,5,6);
		cuboid1.draw();
		System.out.println("Area of Cuboid1:" + cuboid1.area());
		System.out.println("Perimeter of Cuboid1:" + cuboid1.perimeter());
		System.out.println("Volume of Cuboid1:" + cuboid1.volume());
		System.out.println("====================================================");
		
		Cuboid cuboid2 = new Cuboid(4.42343,5.2934873,6.239847);
		cuboid2.draw();
		System.out.println("Area of Cuboid2:" + cuboid2.area());
		System.out.println("Perimeter of Cuboid2:" + cuboid2.perimeter());
		System.out.println("Volume of Cuboid2:" + cuboid2.volume());
		System.out.println("====================================================");

		Circle circle2 = new Circle(9);
		circle2.draw(true);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		circle2.printMe();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		

		try {
			CirclePlus ciclePlus1 = new CirclePlus(11, RainbowColors.RED, "World is small" );
			ciclePlus1.draw(true);
		} catch (ColorRangeException e) {
			System.out.println("Range Exception for color");
			e.printStackTrace();
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		RectanglePlus rectanglePlus1 = new RectanglePlus(15,30,RainbowColors.INDIGO, "World is big");
		rectanglePlus1.draw(true);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("====================================================");
		System.out.println("Shape Name: " + Shape.NAME);
		System.out.println("Shape Count: " + Shape.totalShapes);
		
		System.out.println("Shape2D Name: " + Shape2D.NAME);
		System.out.println("Shape2D Count: " + Shape2D.total2dShapes);
		
		System.out.println("Shape3D Name: " + Shape3D.NAME);
		System.out.println("Shape3D Count: " + Shape3D.total3dShapes);
		System.out.println("====================================================");
	}

}

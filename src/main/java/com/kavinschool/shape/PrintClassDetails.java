/*
 * Kangeyan Passoubady
 * (c) Kavin School -2015
 */
package com.kavinschool.shape;

/**
 * The Class PrintClassDetails.
 */
public class PrintClassDetails {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Class<SquareAbout> obj = SquareAbout.class;

		// Process @About
		if (obj.isAnnotationPresent(About.class)) {

			About about = obj.getAnnotation(About.class);
			System.out.println("Details:");
			System.out.println("Author:" + about.author());
			System.out.println("Description:" + about.description());
			System.out.println("createdDate:" + about.createdDate());
			System.out.println("CurrentVersion:" + about.currentVersion());
			System.out.println("Last Modified By:" + about.lastModifiedBy());
			System.out.println("Last Modified Date:" + about.lastModifiedDate());
		}
	}
}

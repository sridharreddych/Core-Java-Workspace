package com.sree.decarator;

/* Step 2 Create concrete classes implementing the same interface. */

public class Circle implements Shape {
	
	Circle() {
		
		System.out.println("I am Circle constructor being called");
	}
	@Override
	public void draw() {
		System.out.println("Shape: Circle - draw method of circle called");
	}
}
package com.sree.decarator;

/* Step 2 Create concrete classes implementing the same interface. */
public class Rectangle implements Shape {
	
	Rectangle() {
		System.out.println("I am Rectangle constructor being called");
	}
	@Override
	public void draw() {
		System.out.println("Shape: Rectangle- draw method of rectangle called");
	}
}
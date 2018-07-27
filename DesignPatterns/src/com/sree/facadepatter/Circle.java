package com.sree.facadepatter;

/* Step 2 Create concrete classes implementing the same interface. */
public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}
}
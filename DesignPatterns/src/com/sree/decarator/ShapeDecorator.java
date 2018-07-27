package com.sree.decarator;

/* Step 3 Create abstract decorator class implementing the Shape interface. */
public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;
	
	ShapeDecorator(){
		System.out.println("I am abstract ShapeDecarator being called");
	}

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
	}
}
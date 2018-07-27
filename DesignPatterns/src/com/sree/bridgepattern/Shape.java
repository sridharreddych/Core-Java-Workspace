package com.sree.bridgepattern;

/* Step 3 Create an abstract class Shape using the DrawAPI interface. */
public abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
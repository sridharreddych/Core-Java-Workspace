package com.sree.bridgepattern;

/*  Step 2 Create concrete bridge implementer classes implementing the DrawAPI interface. */
public class RedCircle implements DrawAPI {
	
	RedCircle(){
		System.out.println("I am in Red circle");
	}
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	}
}
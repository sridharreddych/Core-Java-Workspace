package com.sree.bridgepattern;

/*  Step 2 Create concrete bridge implementer classes implementing the DrawAPI interface. */
public class GreenCircle implements DrawAPI {
	
	GreenCircle(){
		System.out.println("I am in Green circle");
	}
	
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
	}
}
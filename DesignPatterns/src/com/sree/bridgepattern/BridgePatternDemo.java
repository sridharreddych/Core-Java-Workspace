package com.sree.bridgepattern;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}
}
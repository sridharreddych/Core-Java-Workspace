package com.sree.frontcontrollerdesign;

/* Step 4
Use the FrontController to demonstrate Front Controller Design Pattern. */

public class FrontControllerPatternDemo {
	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}
}
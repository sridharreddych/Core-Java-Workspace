package com.sree.interceptingfilterpattern;

/* Step 3
Create Target */

public class Target {
	public void execute(String request) {
		System.out.println("Executing request: " + request);
	}
}
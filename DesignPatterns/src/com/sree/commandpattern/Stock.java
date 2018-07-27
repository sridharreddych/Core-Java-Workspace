package com.sree.commandpattern;

/* Step 2 Create a request class. */
public class Stock {
	private String name = "ABC";
	private int quantity = 10;
	
	Stock() {
		System.out.println("In Stock Constructor");
	}

	public void buy() {
		System.out.println("Stock [ Name: " + name + ",Quantity: " + quantity + " ] bought");
	}

	public void sell() {
		System.out.println("Stock [ Nam e: " + name + ",Quantity: " + quantity + " ] sold");
	}
}
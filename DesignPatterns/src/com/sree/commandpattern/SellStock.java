package com.sree.commandpattern;

/* Step 3 Create concrete classes implementing the Order interface. */
public class SellStock implements Order {
	private Stock abcStock;
	
	SellStock(){
		System.out.println("In SellStock constructor");
	}

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}
}
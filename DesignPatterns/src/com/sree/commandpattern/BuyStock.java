package com.sree.commandpattern;

/* Step 3 Create concrete classes implementing the Order interface. */
public class BuyStock implements Order {
	private Stock abcStock;
	
	BuyStock(){
		System.out.println("In BuyStock Constructor");
	}

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.buy();
	}
}
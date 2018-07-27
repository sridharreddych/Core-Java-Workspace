package com.sree.strategypattern;

/* Step 2
Create concrete classes implementing the same interface. */

public class OperationAdd implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}
}
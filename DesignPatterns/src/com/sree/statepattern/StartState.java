package com.sree.statepattern;

/* Step 2
Create concrete classes implementing the same interface. */

public class StartState implements State {
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}
}
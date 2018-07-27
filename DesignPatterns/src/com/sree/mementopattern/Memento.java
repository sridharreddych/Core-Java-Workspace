package com.sree.mementopattern;

/* Step 1
Create Memento class. */

public class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
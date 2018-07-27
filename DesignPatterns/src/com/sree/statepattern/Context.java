package com.sree.statepattern;

/* Step 3
Create Context Class. */

public class Context {
	private State state;

	public Context() {
		state = null;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
}
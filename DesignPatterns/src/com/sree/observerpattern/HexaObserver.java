package com.sree.observerpattern;

/* Step 3
Create concrete observer classes */

public class HexaObserver extends Observer {
	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
		System.out.println("Hex String test: " + subject.getState());
	}
}
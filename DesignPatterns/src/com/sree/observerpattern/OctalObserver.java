package com.sree.observerpattern;

/* Step 3
Create concrete observer classes */

public class OctalObserver extends Observer {
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
		System.out.println("Octal String test: " + subject.getState());
	}
}
package com.sree.observerpattern;

/* Step 2
Create Observer class. */

public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}
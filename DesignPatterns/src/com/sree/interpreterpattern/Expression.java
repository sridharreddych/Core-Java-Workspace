package com.sree.interpreterpattern;

/* Step 1 Create an expression interface. */
public interface Expression {
	public boolean interpret(String context);
}
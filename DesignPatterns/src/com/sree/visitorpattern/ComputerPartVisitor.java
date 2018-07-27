package com.sree.visitorpattern;

/* Step 3
Define an interface to represent visitor. */

public interface ComputerPartVisitor {
	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);
}
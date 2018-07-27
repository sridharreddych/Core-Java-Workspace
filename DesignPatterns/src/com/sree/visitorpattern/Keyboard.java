package com.sree.visitorpattern;

/* Step 2
Create concrete classes extending the above class. */

public class Keyboard implements ComputerPart {
@ Override
public void accept(ComputerPartVisitor computerPartVisitor) {
computerPartVisitor.visit(this);
}
}
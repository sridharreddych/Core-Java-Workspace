package com.sree.nullobjectpattern;

/* Step 2
Create concrete classes extending the above class. */

public class RealCustomer extends AbstractCustomer {
	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isNil() {
		return false;
	}
}
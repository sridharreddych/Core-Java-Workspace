package com.sree.nullobjectpattern;

/* Step 2
Create concrete classes extending the above class. */

public class NullCustomer extends AbstractCustomer {
	@Override
	public String getName() {
		return "Not Available in Custom er Database";
	}

	@Override
	public boolean isNil() {
		return true;
	}
}
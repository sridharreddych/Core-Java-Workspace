package com.sree.buiderpattern;

/* step2  Create concrete classes implementing the Packing interface.  */
public class Wrapper implements Packing {
	@ Override
	public String pack() {
		return "Wrapper";
	}
}
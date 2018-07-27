package com.sree.interceptingfilterpattern;

/* Step 2
Create concrete filters. */

public class DebugFilter implements Filter {
	public void execute(String request) {
		System.out.println("request log: " + request);
	}
}
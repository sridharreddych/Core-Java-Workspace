package com.sree.interceptingfilterpattern;

/* Step 2
Create concrete filters. */

public class AuthenticationFilter implements Filter {
	public void execute(String request) {
		System.out.println("Authenticating request: " + request);
	}
}
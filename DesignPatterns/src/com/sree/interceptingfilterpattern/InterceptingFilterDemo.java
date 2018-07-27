package com.sree.interceptingfilterpattern;

/* Step 7
Use the Client to demonstrate Intercepting Filter Design Pattern. */

public class InterceptingFilterDemo {
	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());
		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("HOME");
	}
}
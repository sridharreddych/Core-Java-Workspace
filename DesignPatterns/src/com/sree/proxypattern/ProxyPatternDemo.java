package com.sree.proxypattern;

/* Step 3 Use the ProxyImage to get object of RealImage class when required. */
public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10m b.jpg");
		// im age will be loaded from disk
		image.display();
		System.out.println("");
		// im age will not be loaded from disk
		image.display();
	}
}
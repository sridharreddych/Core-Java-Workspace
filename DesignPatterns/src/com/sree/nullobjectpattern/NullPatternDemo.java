package com.sree.nullobjectpattern;

public class NullPatternDemo {
	public static void main(String[] args) {
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");
		System.out.println("Customers");
		System.out.println("customer1 name matches or not with Rob"+"   "+customer1.getName());
		System.out.println("customer2 name matches or not with Bob"+"   "+customer2.getName());
		System.out.println("customer3 name matches or not with Julie"+"   "+customer3.getName());
		System.out.println("customer4 name matches or not with Laura"+"   "+customer4.getName());
	}
}
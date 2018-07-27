package com.sree.businessdelegate;

/* Step 6
Use BusinessDelegate and Client classes to demonstrate Business Delegate pattern. */

public class BusinessDelegatePatternDemo {
	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");
		Client client = new Client(businessDelegate);
		client.doTask();
		businessDelegate.setServiceType("JMS");
		client.doTask();
	}
}
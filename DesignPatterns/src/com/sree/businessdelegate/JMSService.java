package com.sree.businessdelegate;

/* Step 2
Create Concreate Service Classes. */

public class JMSService implements BusinessService {
	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
	}
}

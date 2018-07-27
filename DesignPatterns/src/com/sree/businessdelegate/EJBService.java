package com.sree.businessdelegate;

/* Step 2
Create Concreate Service Classes. */

public class EJBService implements BusinessService {
	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
	}
}
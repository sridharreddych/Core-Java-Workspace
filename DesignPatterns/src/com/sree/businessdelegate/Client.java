package com.sree.businessdelegate;

/* Step 5
Create Client. */

public class Client {
	BusinessDelegate businessService;

	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}

	public void doTask() {
		businessService.doTask(); //indirectly calling BusinessDelegate.doTask()
	}
}
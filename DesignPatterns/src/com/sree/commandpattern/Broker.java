package com.sree.commandpattern;

/* Step4 Create command invoker class. */
import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Order> orderList = new ArrayList<Order>();

	Broker(){
		System.out.println("In Broker Constructor");
	}
	
	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders() {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
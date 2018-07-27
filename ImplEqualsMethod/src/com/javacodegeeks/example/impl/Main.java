package com.javacodegeeks.example.impl;

public class Main {

	public static void main(String[] args) {
		Vehicle myCar = new Vehicle("Focus",2002,"Ford");
		Vehicle minivan = new Vehicle ("Odyssey",2014,"Honda");
		Vehicle focus = new Vehicle("Focus",2002,"Ford");
		
		if (myCar.equals(minivan)) {
			System.out.println("This isn't supposed to print!");
		}
		else {
			System.out.println("two objects data of mycar and mininvan are difference hence equals will not be correct");
		}
		
		if (myCar.equals(focus)) {
			System.out.println("The equals method is implemented OK");
		}
		
		System.out.println("myCar == minivan: "+(myCar == minivan));
		System.out.println("myCar.equals(minivan): "+(myCar.equals(minivan)));
		System.out.println("myCar == focus: "+(myCar == focus));
		System.out.println("myCar.equals(focus): "+(myCar.equals(focus)));

	}

}

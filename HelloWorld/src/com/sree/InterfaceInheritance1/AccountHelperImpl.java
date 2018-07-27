package com.sree.InterfaceInheritance1;

public class AccountHelperImpl implements Account {
public void deposit(double amount) {
System.out.println("depositing " + amount);
}
public void withdraw(double amount) {
System.out.println("withdrawing " + amount);
}
@Override
public double calculateInterest(double amount) {
	// TODO Auto-generated method stub
	return 0;
}
}
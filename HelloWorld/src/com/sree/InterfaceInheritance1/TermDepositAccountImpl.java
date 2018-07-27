package com.sree.InterfaceInheritance1;

public class TermDepositAccountImpl implements Account {
	// composed helper class (i.e. composition).
	Account helper = new AccountHelperImpl ();
	public double calculateInterest (double amount) {
	//calculate interest for SavingsAccount
	return amount * 0.05;
	}
	public void deposit (double amount) {
	helper.deposit (amount) ; // code reuse via composition
	}
	public void withdraw (double amount) {
	helper.withdraw (amount) ; // code reuse via composition
	}
	}
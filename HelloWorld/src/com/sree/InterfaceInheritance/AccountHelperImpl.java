package com.sree.InterfaceInheritance;

public class AccountHelperImpl implements AccountHelper {
public void deposit(double amount) {
System.out.println("depositing " + amount);
}
public void withdraw(double amount) {
System.out.println("withdrawing " + amount);
}
}
package com.ddlab.core;

/**
 * @author Debadatta Mishra(PIKU)
 *
 */
public class TestEmp
{
	public static void main(String[] args) 
	{
		Emp emp1 = new Emp(23);
		Emp emp2 = new Emp(23);
		System.out.println("emp1.equals(emp2)--->>>"+emp1.equals(emp2));
		System.out.println("emp1==emp2--->>>"+ (emp1==emp2));
	}
}

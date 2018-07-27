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
		System.out.println("Overridden hashCode()--->>>"+emp1.hashCode());
		int originalHashCode = System.identityHashCode(emp1);
		System.out.println("Original hashCode of Emp---->>>"+originalHashCode);
	}
}

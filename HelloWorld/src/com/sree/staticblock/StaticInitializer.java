package com.sree.staticblock;

public class StaticInitializer {
public static final int A = 5;
public static final int B; //note that it is not public static final int B = null;
//note that since B is final, it can be initialized only once.
//Static initializer block, which is executed only once when the class is loaded.
static {
if(A == 5)
B = 10;
else
B = 5;
}
public StaticInitializer(){
	
	System.out.println("First Static intializer called then constructor will be called");
} //constructor is called only after static initializer block
}
package com.sree.chainofresponsibilitypattern;

/* Step2 Create concrete classes extending the logger. */
public class ErrorLogger extends AbstractLogger {
	
	ErrorLogger(){
		System.out.println("I am ErrorLogger Constructor");
	}
	
	public ErrorLogger(int level) {
		this.level = level;
		System.out.println("I am Errorlogger with int parameter");
	}

	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}
}
package com.sree.chainofresponsibilitypattern;

/* Step2 Create concrete classes extending the logger. */
public class ConsoleLogger extends AbstractLogger {
	
	ConsoleLogger(){
		System.out.println("I am ConsoleLogger constructor");
	}
	
	public ConsoleLogger(int level) {
		this.level = level;
		System.out.println("I am consolelogger with int parameter");
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}
}
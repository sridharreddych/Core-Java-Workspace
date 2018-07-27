package com.sree.chainofresponsibilitypattern;

/* Step 1 Create an abstract logger class. */
public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	protected int level;
	// next elem ent in chain or responsibility
	protected AbstractLogger nextLogger;
	
	AbstractLogger(){
		System.out.println("I am AbstractLogger Constructor");
		System.out.println("Info value"+"    "+INFO+"   "+"Debug value"+"  "+DEBUG+"   "+"Error Value"+ERROR);
	}

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
		System.out.println("I am setNextLogger void method of Abstract Logger");
	}

	public void logMessage(int level, String message) {
		if (this.level <= level) {
			write(message);
			System.out.println("I am in logMessage method of Abstract logger in IF condition this.level<=level");
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
			System.out.println("I am in logMessage method of Abstract logger in IF condition nextLogger!=null");
		}
	}

	abstract protected void write(String message);
	{ System.out.println("I am in write message of AbstractLogger");
}
}
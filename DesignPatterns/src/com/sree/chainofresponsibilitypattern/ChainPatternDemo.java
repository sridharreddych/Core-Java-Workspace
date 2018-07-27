package com.sree.chainofresponsibilitypattern;

/* Step 3 Create different types of loggers. Assign them error levels and set next logger in each logger. Next logger in each logger represents the part of the chain. */
public class ChainPatternDemo {
	
	
	ChainPatternDemo(){
		System.out.println("I am ChainPatternDemo constructor");
	}
	
	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		//AbstractLogger fileLogger1 = new FileLogger(AbstractLogger.DEBUG);
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		System.out.println(errorLogger.toString());
		System.out.println();
		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();
		loggerChain.logMessage(AbstractLogger.INFO, "This is an inform ation.");
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level inform ation.");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error inform ation.");
		
	}
}
package com.sree.chainofresponsibilitypattern;

/* Step2 Create concrete classes extending the logger. */
public class FileLogger extends AbstractLogger {
	
	FileLogger() {
		System.out.println("I am FileLogger constructor");
	}
	public FileLogger(int level) {
		this.level = level;
		System.out.println("I am Filelogger with int parameter");
	}

	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}
}
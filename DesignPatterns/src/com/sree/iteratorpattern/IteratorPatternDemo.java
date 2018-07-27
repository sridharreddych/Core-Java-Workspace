package com.sree.iteratorpattern;

/* Step 3
Use the NameRepository to get iterator and print names. */
public class IteratorPatternDemo {
	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();
		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Nam e : " + name);
		}
	}
}

package com.sree.templatepattern;

/* Step 3
Use the Game's template method play() to demonstrate a defined way of playing game. */

public class TemplatePatternDemo {
	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}
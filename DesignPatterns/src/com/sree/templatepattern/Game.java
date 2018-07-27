package com.sree.templatepattern;

/* Step 1
Create an abstract class with a template method being final. */

public abstract class Game {
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// template method
	public final void play() {
		// initialize the game
		initialize();
		// start game
		startPlay();
		// end game
		endPlay();
	}
}
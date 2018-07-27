package com.sree.adaptorpattern;

/*  *Step 1Create interfaces for Media Player and Advanced Media Player. */
public interface AdvancedMediaPlayer {
	public void playVlc(String fileName);

	public void playMp4(String fileName);
}
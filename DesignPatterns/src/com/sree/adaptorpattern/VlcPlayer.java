package com.sree.adaptorpattern;

/*Step 2 Create concrete classes implementing the AdvancedMediaPlayer interface. */
public class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Nam e: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// do nothing
	}
}
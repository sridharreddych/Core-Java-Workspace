package com.sree.adaptorpattern;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "beyond the horizon.m p3");
		audioPlayer.play("mp4", "alone.m p4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "m ind m e.avi");
	}
}
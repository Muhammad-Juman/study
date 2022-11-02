package com.dhuyo.interfaces.mediaplayer;

public class VlcPlayer implements PlayAudio,PlayVideo,Forward{
	
	@Override
	public void playAudioList() {
		System.out.println("Audio is playing");
	}
	
	@Override
	public void playVideoList() {
		System.out.println("Video is playing");
		
	}
	
	@Override
	public void speedUp() {
		System.out.println("Forward video");
		
	}

}

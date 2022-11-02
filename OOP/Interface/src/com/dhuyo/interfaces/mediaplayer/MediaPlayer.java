package com.dhuyo.interfaces.mediaplayer;

public class MediaPlayer {
   public static void main(String[] args) {
	   VlcPlayer vlc = new VlcPlayer();
	   vlc.playAudioList();
	   vlc.playVideoList();
	   vlc.speedUp();
	   
   }
}

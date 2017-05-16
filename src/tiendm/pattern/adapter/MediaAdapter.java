package tiendm.pattern.adapter;

public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("avi")) {
			advancedMediaPlayer = new AviPlayer();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer.playVLC(fileName);
		} else if (audioType.equalsIgnoreCase("avi")) {
			advancedMediaPlayer.playAVI(fileName);
		}
	}

}

package tiendm.pattern.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		System.out.println("Media play VLC file " + fileName);
		
	}

	@Override
	public void playAVI(String fileName) {
		
	}

}

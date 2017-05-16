package tiendm.pattern.adapter;

public class AviPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playAVI(String fileName) {
		System.out.println("Media play AVI file " + fileName);
		
	}

}

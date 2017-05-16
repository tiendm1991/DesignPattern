package tiendm.pattern.adapter;

public class AudioPlayerAdapter implements MediaPlayer{
	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		mediaAdapter = new MediaAdapter(audioType);
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Audio play mp3 file " + fileName);
		}else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("avi")) {
			mediaAdapter.play(audioType, fileName);
		}else {
			System.out.println("Cannot open file " + fileName);
		}
		
	}

}

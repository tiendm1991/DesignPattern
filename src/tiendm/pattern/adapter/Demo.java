package tiendm.pattern.adapter;

public class Demo {
	public static void main(String[] args) {
		AudioPlayerAdapter audioPlayer = new AudioPlayerAdapter();
		audioPlayer.play("avi", "aaaaaa.avi");
		audioPlayer.play("mp3", "aaaaaa.mp3");
		audioPlayer.play("mp4", "aaaaaa.mp4");
		audioPlayer.play("vlc", "aaaaaa.vlc");
		audioPlayer.play("wmv", "aaaaaa.wmv");
	}
}

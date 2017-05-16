package tiendm.pattern.template;

public class Demo {
	public static void main(String[] args) {
		PlayGame football = new FootBall();
		football.play();
		System.out.println("***************");
		PlayGame halflife = new HalfLife();
		halflife.play();
	}
}

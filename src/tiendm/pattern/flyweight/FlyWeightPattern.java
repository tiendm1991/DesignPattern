package tiendm.pattern.flyweight;

import java.util.Random;

public class FlyWeightPattern {
	private static String colors[] = { "red","green","blue","yellow","brown","gray","orange","purple" };
	public static void main(String[] args) {
		Random rand = new Random();
		for(int i=0;i<20;i++){
			Circle circle = (Circle) ShapeFactory.getCircle(colors[rand.nextInt(colors.length)]);
			circle.setX(rand.nextInt(100));
			circle.setY(rand.nextInt(100));
			circle.setRadius(rand.nextInt(100));
			circle.draw();
		}
		System.out.println(ShapeFactory.circleMap);
	}
}

package tiendm.pattern.bridge;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Circle red = new Circle(2, 2, 5, new DrawRedCircle());
		Circle green = new Circle(2, 2, 5, new DrawGreenCircle());
		red.drawShape();
		green.drawShape();
	}
}

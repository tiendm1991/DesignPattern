package tiendm.pattern.decorator;

public class Demo {
	public static void main(String[] args) {
		Shape triangel = new Triangle();
		ShapeDecorator redTriangel = new RedShapeDecorator(triangel);
		redTriangel.draw();
	}
}

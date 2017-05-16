package tiendm.pattern.prototype;

public class Rectangle extends Shape {

	public Rectangle() {
		setType("Rectangle");
	}
	@Override
	void draw() {
		System.out.println("* * * *");
		System.out.println("*     *");
		System.out.println("* * * *");
	}
	
}

package tiendm.pattern.prototype;

public class Triangel extends Shape{
	
	public Triangel() {
		setType("Triangel");
	}

	@Override
	void draw() {
		System.out.println("  *  ");
		System.out.println(" * * ");
		System.out.println("* * *");
	}
	
}

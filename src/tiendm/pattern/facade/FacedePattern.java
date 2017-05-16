package tiendm.pattern.facade;

public class FacedePattern {
	Shape circle;
	Shape triangle;
	Shape rectangle;
	public FacedePattern() {
		this.circle = new Circle();
		this.triangle = new Triangle();
		this.rectangle = new Rectangle();
	}
	
	public void drawCircle(){
		circle.draw();
	}
	
	public void drawTriangel(){
		triangle.draw();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
}

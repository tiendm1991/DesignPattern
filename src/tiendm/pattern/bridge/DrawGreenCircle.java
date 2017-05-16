package tiendm.pattern.bridge;

public class DrawGreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Draw green circle with radius=" + radius + ", x="+x+", y="+y);
		
	}

}

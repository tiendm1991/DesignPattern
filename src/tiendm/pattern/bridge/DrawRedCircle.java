package tiendm.pattern.bridge;

public class DrawRedCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Draw red circle with radius=" + radius + ", x="+x+", y="+y);
		
	}

}

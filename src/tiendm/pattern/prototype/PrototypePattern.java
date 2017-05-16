package tiendm.pattern.prototype;

import java.util.HashMap;

public class PrototypePattern {
	private static HashMap<String, Shape> shapeMap = new HashMap<>();
	public static Shape getShape(String id){
		Shape shape = shapeMap.get(id);
		return (Shape) shape.clone();
	}
	
	public static void loadCache(){
		Triangel triangel = new Triangel();
		triangel.setId("1");
		shapeMap.put(triangel.getId(), triangel);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);
	}

	public static HashMap<String, Shape> getShapeMap() {
		return shapeMap;
	}

	public static void setShapeMap(HashMap<String, Shape> shapeMap) {
		PrototypePattern.shapeMap = shapeMap;
	}
	
}

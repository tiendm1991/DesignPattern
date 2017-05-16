package tiendm.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	static Map<String, Shape> circleMap = new HashMap<>();
	public static Shape getCircle(String color){
		Circle circle = (Circle) circleMap.get(color);
		if(circle == null){
			System.out.println("Create shape witn color: "+ color);
			circle = new Circle(color, 0, 0, 0);
			circleMap.put(color, circle);
		}
		return circle;
	}
}

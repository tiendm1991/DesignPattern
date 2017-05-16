package tiendm.pattern.prototype;

import java.util.Map.Entry;

public class Demo {
	public static void main(String[] args) {
		PrototypePattern pattern = new PrototypePattern();
		pattern.loadCache();
		for(Entry<String, Shape> entry : pattern.getShapeMap().entrySet()){
			Shape shape = entry.getValue();
			System.out.println("==================");
			System.out.println(shape.getType());
			shape.draw();
		}
	}
}

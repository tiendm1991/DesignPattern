package tiendm.pattern.factory;

import tiendm.pattern.factory.entity.Color;
import tiendm.pattern.factory.entity.ColorType;
import tiendm.pattern.factory.entity.Shape;
import tiendm.pattern.factory.entity.ShapeType;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		FactoryProduct product = new FactoryProduct();
		AbstractFactory shapeFactory = product.getFactory("shape");
		Shape square = shapeFactory.getShape(ShapeType.SQUARE);
		square.draw();
		AbstractFactory colorFactory = product.getFactory("color");
		Color color = colorFactory.getColor(ColorType.RED);
		color.fill();
	}
}

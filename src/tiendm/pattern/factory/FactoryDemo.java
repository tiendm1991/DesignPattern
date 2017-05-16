package tiendm.pattern.factory;

import tiendm.pattern.factory.entity.Color;
import tiendm.pattern.factory.entity.ColorType;
import tiendm.pattern.factory.entity.Shape;
import tiendm.pattern.factory.entity.ShapeType;

public class FactoryDemo  {
	//Test commit git
	public static void main(String[] args) {
		AbstractFactory shapeFactory = new ShapeFactory();
		Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
		rectangle.draw();
		Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
		circle.draw();
		Shape square = shapeFactory.getShape(ShapeType.SQUARE);
		square.draw();
		AbstractFactory colorFactory = new ColorFactory();
		Color red = colorFactory.getColor(ColorType.RED);
		red.fill();
		Color blue = colorFactory.getColor(ColorType.BLUE);
		blue.fill();
		Color green = colorFactory.getColor(ColorType.GREEN);
		green.fill();
	}
}

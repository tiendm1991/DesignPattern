package tiendm.pattern.factory;

import tiendm.pattern.factory.entity.Circle;
import tiendm.pattern.factory.entity.Color;
import tiendm.pattern.factory.entity.ColorType;
import tiendm.pattern.factory.entity.Rectangle;
import tiendm.pattern.factory.entity.Shape;
import tiendm.pattern.factory.entity.ShapeType;
import tiendm.pattern.factory.entity.Square;

public class ShapeFactory extends AbstractFactory{
	
	@Override
	public Shape getShape(ShapeType shapeType){
		switch (shapeType) {
		case CIRCLE:
			return new Circle();
		case RECTANGLE:
			return new Rectangle();
		case SQUARE:
			return new Square();
		default:
			return null;
		}
	}

	@Override
	Color getColor(ColorType colorType) {
		// TODO Auto-generated method stub
		return null;
	}
}

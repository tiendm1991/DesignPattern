package tiendm.pattern.factory;

import tiendm.pattern.factory.entity.Blue;
import tiendm.pattern.factory.entity.Color;
import tiendm.pattern.factory.entity.ColorType;
import tiendm.pattern.factory.entity.Green;
import tiendm.pattern.factory.entity.Red;
import tiendm.pattern.factory.entity.Shape;
import tiendm.pattern.factory.entity.ShapeType;

public class ColorFactory extends AbstractFactory{
	
	@Override
	public Color getColor(ColorType colorType){
		switch (colorType) {
		case RED:
			return new Red();
		case BLUE:
			return new Blue();
		case GREEN:
			return new Green();
		default:
			return null;
		}
	}

	@Override
	Shape getShape(ShapeType shapeType) {
		// TODO Auto-generated method stub
		return null;
	}
}

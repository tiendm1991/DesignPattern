package tiendm.pattern.factory;

import tiendm.pattern.factory.entity.Color;
import tiendm.pattern.factory.entity.ColorType;
import tiendm.pattern.factory.entity.Shape;
import tiendm.pattern.factory.entity.ShapeType;

public abstract class AbstractFactory {
	abstract Shape getShape(ShapeType shapeType);
	abstract Color getColor(ColorType colorType);
}

package tiendm.pattern.factory;

public class FactoryProduct {
	public AbstractFactory getFactory(String strFactory){
		if(strFactory.equalsIgnoreCase("shape")){
			return new ShapeFactory();
		}else if (strFactory.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		return null;
	}
}

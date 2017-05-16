package tiendm.pattern.compositeEntity;

public class Demo {
	public static void main(String[] args) {
		CompositeEntity composites = new CompositeEntity();
		composites.printData();
		composites.setData("xxx", "yyy");
		composites.printData();
	}
}

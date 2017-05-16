package tiendm.pattern.builder;

public class Coca extends ColdDrink {

	@Override
	public String name() {
		return "Coca";
	}

	@Override
	public float price() {
		return 10.0f;
	}

}

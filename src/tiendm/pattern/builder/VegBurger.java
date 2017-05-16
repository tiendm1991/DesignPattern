package tiendm.pattern.builder;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "VegBurger";
	}

	@Override
	public float price() {
		return 20.0f;
	}

}

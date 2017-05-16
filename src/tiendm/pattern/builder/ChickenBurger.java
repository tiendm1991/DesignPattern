package tiendm.pattern.builder;

public class ChickenBurger extends Burger{

	@Override
	public String name() {
		return "ChickenBurger";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}

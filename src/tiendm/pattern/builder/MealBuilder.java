package tiendm.pattern.builder;

public class MealBuilder {
	public Meal createVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
	public Meal createChickenMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		meal.addItem(new Coca());
		return meal;
	}
}

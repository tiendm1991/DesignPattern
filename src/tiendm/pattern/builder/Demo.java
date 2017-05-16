package tiendm.pattern.builder;

public class Demo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal mealDemo = mealBuilder.createChickenMeal();
		mealDemo.showItem();
		System.out.println("Cost mealChicken= "+ mealDemo.getCost());
	}
}

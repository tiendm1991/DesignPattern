package tiendm.pattern.strategy;

public class Demo {
	public static void main(String[] args) {
		int num1 = 10; int num2 = 5;
		Context context = new Context(new Add());
		operation(num1, num2, context.getStrategy());
		context = new Context(new Substract());
		operation(num1, num2, context.getStrategy());
		context = new Context(new Multiply());
		operation(num1, num2, context.getStrategy());
	}
	public static void operation(int num1, int num2, Strategy strategy) {
		int result = (strategy.doOperation(num1, num2));
		if(strategy instanceof Add){
			System.out.println(num1 + " + " +num2 + " = " + result );
		} else if(strategy instanceof Substract){
			System.out.println(num1 + " - " +num2 + " = " + result );
		} else if(strategy instanceof Multiply){
			System.out.println(num1 + " * " +num2 + " = " + result );
		} 
	}
}

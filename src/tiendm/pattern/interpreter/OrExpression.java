package tiendm.pattern.interpreter;

public class OrExpression implements Expression{
	
	private Expression expression1;
	private Expression expression2;
	
	public OrExpression(Expression expression1, Expression expression2) {
		super();
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	public Expression getExpression1() {
		return expression1;
	}

	public void setExpression1(Expression expression1) {
		this.expression1 = expression1;
	}

	public Expression getExpression2() {
		return expression2;
	}

	public void setExpression2(Expression expression2) {
		this.expression2 = expression2;
	}

	@Override
	public boolean interpret(String context) {
		return expression1.interpret(context) || expression2.interpret(context);
	}

}

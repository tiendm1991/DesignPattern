package tiendm.pattern.interpreter;

public class TerminalExpression implements Expression {
	private String data;
	
	public TerminalExpression(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		return context.contains(data);
	}
	
}

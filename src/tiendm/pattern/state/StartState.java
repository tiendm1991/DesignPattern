package tiendm.pattern.state;

public class StartState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("player in start state");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "StartState";
	}
	
	

}

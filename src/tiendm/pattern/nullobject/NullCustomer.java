package tiendm.pattern.nullobject;

public class NullCustomer extends AbstractCustomer {

	@Override
	protected boolean isNil() {
		return true;
	}

	@Override
	protected String getName() {
		// TODO Auto-generated method stub
		return "Null Customer";
	}

	@Override
	public String toString() {
		return "NullCustomer [getName()=" + getName() + "]";
	}
	
	
	
}

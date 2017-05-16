package tiendm.pattern.nullobject;

public class RealCustomer extends AbstractCustomer {
	
	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	protected boolean isNil() {
		return false;
	}

	@Override
	protected String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "RealCustomer [name=" + name + "]";
	}
	
}

package tiendm.pattern.businessDelegate;

public class Client {
	private BusinessDelegate businessDelegate;

	public Client(BusinessDelegate businessDelegate) {
		super();
		this.businessDelegate = businessDelegate;
	}
	
	public void doTask(){
		businessDelegate.doTask();
	}

	public BusinessDelegate getBusinessDelegate() {
		return businessDelegate;
	}

	public void setBusinessDelegate(BusinessDelegate businessDelegate) {
		this.businessDelegate = businessDelegate;
	}
	
}

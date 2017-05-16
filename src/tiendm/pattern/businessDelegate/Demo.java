package tiendm.pattern.businessDelegate;

public class Demo {
	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate("EJB");
		Client client = new Client(businessDelegate);
		client.doTask();
		businessDelegate.setServiceType("JMS");
		client.doTask();
	}
}

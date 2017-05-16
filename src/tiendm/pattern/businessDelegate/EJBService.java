package tiendm.pattern.businessDelegate;

public class EJBService implements BusinessService{

	@Override
	public void doProcessing() {
		System.out.println("Processing EJBService");
		
	}

}

package tiendm.pattern.businessDelegate;

public class JMSService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing JMSService");
		
	}

}

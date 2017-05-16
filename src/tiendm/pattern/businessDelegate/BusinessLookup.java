package tiendm.pattern.businessDelegate;

public class BusinessLookup {
	public BusinessService getBusiness(String serviceType){
		if("EJB".equalsIgnoreCase(serviceType)){
			return new EJBService();
		}else {
			return new JMSService();
		}
	}
}

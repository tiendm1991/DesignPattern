package tiendm.pattern.businessDelegate;

public class BusinessDelegate {
	private BusinessLookup lookup = new BusinessLookup();
	private BusinessService service;
	private String serviceType;
	
	public BusinessDelegate(String strType) {
		super();
		this.serviceType = strType;
	}
	
	public void doTask(){
		service = lookup.getBusiness(serviceType);
		service.doProcessing();
	}
	
	public BusinessLookup getLookup() {
		return lookup;
	}
	public void setLookup(BusinessLookup lookup) {
		this.lookup = lookup;
	}
	public BusinessService getService() {
		return service;
	}
	public void setService(BusinessService service) {
		this.service = service;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
}

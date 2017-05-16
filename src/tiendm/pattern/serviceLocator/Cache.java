package tiendm.pattern.serviceLocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	private List<Service> lsService;
	
	public Cache() {
		lsService = new ArrayList<>();
	}
	
	public Service getService(String name){
		for(Service service : lsService){
			if(service.getName().equalsIgnoreCase(name)){
				return service;
			}
		}
		return null;
	}
	
	public void addService(Service service){
		boolean exist = false;
		for(Service s: lsService){
			if(s.getName().equalsIgnoreCase(service.getName())){
				exist = true;
				break;
			}
		}
		if(!exist){
			lsService.add(service);
		}
	}

	public List<Service> getLsService() {
		return lsService;
	}

	public void setLsService(List<Service> lsService) {
		this.lsService = lsService;
	}
	
	
}

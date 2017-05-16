package tiendm.pattern.serviceLocator;

public class ServiceLocator {
	public static Cache cache;
	static{
		cache = new Cache();
	}
	
	public static Service getService(String name){
		Service service = cache.getService(name);
		if(service != null){
			return service;
		}
		InitialContext init = new InitialContext();
		service = (Service) init.lookUp(name);
		cache.addService(service);
		return service;
	}
}

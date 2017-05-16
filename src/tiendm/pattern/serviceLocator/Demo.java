package tiendm.pattern.serviceLocator;

public class Demo {
	public static void main(String[] args) {
		Service service1 = ServiceLocator.getService("service1");
		service1.excute();
		Service service1b = ServiceLocator.getService("service1");
		service1b.excute();
		Service service2 = ServiceLocator.getService("service2");
		service2.excute();
		
	}
}

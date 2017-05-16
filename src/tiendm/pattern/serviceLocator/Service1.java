package tiendm.pattern.serviceLocator;

public class Service1 implements Service {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "service1";
	}

	@Override
	public void excute() {
		System.out.println(getName() + " excute");
		
	}

}

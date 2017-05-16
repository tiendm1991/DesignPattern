package tiendm.pattern.serviceLocator;

public class Service2 implements Service {

	@Override
	public String getName() {
		return "service2";
	}

	@Override
	public void excute() {
		System.out.println(getName() + " excute");
	}

}

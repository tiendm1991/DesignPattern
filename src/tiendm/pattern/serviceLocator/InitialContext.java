package tiendm.pattern.serviceLocator;

public class InitialContext {
	public Object lookUp(String name){
		if(name.equalsIgnoreCase("service1")){
			System.out.println("init service1 in InitialContext");
			return new Service1();
		}else{
			System.out.println("init service2 in InitialContext");
			return new Service2();
		}
	}
}

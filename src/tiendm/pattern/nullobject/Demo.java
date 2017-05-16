package tiendm.pattern.nullobject;

public class Demo {
	public static void main(String[] args) {
		AbstractCustomer real = CustomerFactory.getCustomer("TienDM");
		System.out.println(real);
		AbstractCustomer nullCus = CustomerFactory.getCustomer("xxx");
		System.out.println(nullCus);
	}
}

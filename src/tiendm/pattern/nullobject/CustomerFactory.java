package tiendm.pattern.nullobject;

public class CustomerFactory {
	public static final String names[] = {"TienDM","SamVQ","SinhHV"};
	public static AbstractCustomer getCustomer(String name){
		for(int i=0;i<names.length;i++){
			if(names[i].equalsIgnoreCase(name)) return new RealCustomer(name);
		}
		return new NullCustomer();
	}
}

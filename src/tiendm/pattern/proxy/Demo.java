package tiendm.pattern.proxy;

public class Demo {
	public static void main(String[] args) {
		ProxyImage proxy = new ProxyImage("dragonball.jpg");
		proxy.display();
		proxy.display();
	}
}

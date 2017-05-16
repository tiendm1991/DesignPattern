package tiendm.pattern.observer;

public class Demo {
	public static void main(String[] args) {
		Subject sub = new Subject();
		Observer bin = new BinaryObserver(sub);
		Observer oct = new OctalObserver(sub);
		Observer hex = new HexaObserver(sub);
		System.out.println("First state change: 15");
		sub.setState(15);
		System.out.println("Second state change: 10");
		sub.setState(10);
	}
}

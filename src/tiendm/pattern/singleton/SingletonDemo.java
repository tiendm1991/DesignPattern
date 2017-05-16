package tiendm.pattern.singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		SingletonPattern pattern = SingletonPattern.getInstance();
		pattern.print();
	}
}

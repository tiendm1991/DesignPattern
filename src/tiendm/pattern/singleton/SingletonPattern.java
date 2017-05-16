package tiendm.pattern.singleton;

/*
Note: Different between singleton and static class
1. stack, heap
2. singleton can instance, clone, inherently, polymorphically
3. static class have all static method and cannot exchange
4. static method cannot override
5. singleton can create instance and pass to method
6. single more easy maintain
7. singleton can lazyload when need
8. singleton class can implement interface
*/
public class SingletonPattern {
	private static SingletonPattern singletonPattern = new SingletonPattern();

	private SingletonPattern() {
	}
	
	public static SingletonPattern getInstance(){
		return singletonPattern;
	}
	
	public void print(){
		System.out.println("Singleton Object");
	}
}

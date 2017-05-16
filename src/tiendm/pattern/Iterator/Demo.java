package tiendm.pattern.Iterator;

public class Demo {
	public static void main(String[] args) {
		NameResponsitory namesRepository = new NameResponsitory();
		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}

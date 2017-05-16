package tiendm.pattern.composite;

public class CompositePattern {
	public static void main(String[] args) {
		Employee CEO = new Employee("Boss", "Director", "CEO");
		Employee manager = new Employee("Manager", "Director", "manage");
		Employee techLead = new Employee("TechLead", "Technical", "technical");
		Employee dev1 = new Employee("dev1", "development", "code");
		Employee dev2 = new Employee("dev2", "development", "code");
		Employee testLead = new Employee("TestLead", "Test", "test");
		Employee test1 = new Employee("test1", "Test", "test");
		Employee test2 = new Employee("test2", "Test", "test");
		
		CEO.add(manager);
		manager.add(testLead);
		manager.add(techLead);
		techLead.add(dev1);
		techLead.add(dev1);
		testLead.add(test1);
		testLead.add(test2);
		
		printAllEmp(CEO);
	}
	
	public static void printAllEmp(Employee e){
		System.out.println(e);
		if(e.getLsSubordinates()!=null && e.getLsSubordinates().size()>0){
			for(Employee item : e.getLsSubordinates()){
				printAllEmp(item);
			}
		}
	}
}

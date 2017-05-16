package tiendm.pattern.filter;

public class Person {
	private String name;
	Gender gender;
	MaritalStatus maritalStatus;
	public Person(String name, Gender gender, MaritalStatus maritalStatus) {
		super();
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", maritalStatus=" + maritalStatus + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
}

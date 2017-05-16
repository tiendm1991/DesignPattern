package tiendm.pattern.filter;

public enum Gender {
	MALE("MALE"),FEMALE("FEMALE");
	
	private Gender(String gender) {
		this.gender = gender;
	}

	private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public static void main(String[] args) {
		System.out.println(Gender.MALE);
	}
}

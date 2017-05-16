package tiendm.pattern.filter;

public enum MaritalStatus {
	
	SINGLE("SINGLE"), MARRIED("SINGLE");
	private String status;
	
	private MaritalStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}

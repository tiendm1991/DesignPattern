package tiendm.pattern.meiator;

public class User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		super();
		this.name = name;
	}
	
	public void sendMessage(String mess){
		ChatRoom.showMessage(this, mess);
	}
}

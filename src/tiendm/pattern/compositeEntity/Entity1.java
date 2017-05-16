package tiendm.pattern.compositeEntity;

public class Entity1 {
	private String data;
	

	public Entity1(String data) {
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Entity1 [data=" + data + "]";
	}
	
}

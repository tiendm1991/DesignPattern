package tiendm.pattern.compositeEntity;

public class Entity2 {
	private String data;

	public Entity2(String data) {
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
		return "Entity2 [data=" + data + "]";
	}
	
}

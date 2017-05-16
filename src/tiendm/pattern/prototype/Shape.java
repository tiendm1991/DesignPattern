package tiendm.pattern.prototype;

public abstract class Shape implements Cloneable{
	private String id;
	private String type;
	abstract void draw();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public Object clone(){
		Object clone = null;
		try {
			clone = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clone;
	}
}

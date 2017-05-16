package tiendm.pattern.proxy;

public class RealImage implements Image {
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadByReal();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void loadByReal() {
		System.out.println("Image load by RealImage");
	}
	
	@Override
	public void display() {
		System.out.println("Image with name is: " + fileName);
		
	}

}

package tiendm.pattern.proxy;

public class ProxyImage implements Image {
	static final String typeImage[] = {"jpg","jpe","jpeg","png","gif"};
	private String fileName;
	private RealImage realImage;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public RealImage getRealImage() {
		return realImage;
	}
	public void setRealImage(RealImage realImage) {
		this.realImage = realImage;
	}

	@Override
	public void display() {
		System.out.println("Image load in proxy");
		if(validate(fileName)){
			if(realImage == null){
				realImage = new RealImage(fileName);
			}
			realImage.display();
		}else{
			System.out.println("Can not display file because it invalid!");
		}
	}

	private boolean validate(String fileName) {
		for(String str: typeImage){
			if(fileName.toLowerCase().endsWith(str)) return true;
		}
		return false;
	}
	
}

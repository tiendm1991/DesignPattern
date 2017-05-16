package tiendm.pattern.compositeEntity;

public class CompositeEntity {
	private CoarseGrainedEntity ce = new CoarseGrainedEntity();
	
	public void printData(){
		String [] datas = ce.getData();
		System.out.println("*******************");
		for(String data:datas){
			System.out.println("data: "+data);
		}
	}
	public void setData(String data1, String data2){
		ce.setData(data1, data2);
	}
}

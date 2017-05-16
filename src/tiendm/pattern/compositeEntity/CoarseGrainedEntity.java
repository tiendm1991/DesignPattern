package tiendm.pattern.compositeEntity;

public class CoarseGrainedEntity {
	Entity1 ent1 = new Entity1("entity1");
	Entity2 ent2 = new Entity2("entity2");
	
	public void setData(String data1, String data2){
		ent1.setData(data1);
		ent2.setData(data2);
	}
	
	public String[] getData(){
		return new String[]{ent1.getData(), ent2.getData()};
	}
}

package tiendm.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> lsItem = new ArrayList<>();
	
	public void addItem(Item item){
		lsItem.add(item);
	}
	
	public float getCost(){
		float cost = 0.0f;
		for(Item item: lsItem){
			cost+=item.price();
		}
		return cost;
	}
	
	public void showItem(){
		for(Item item : lsItem){
			System.out.print("Item name: " + item.name());
			System.out.print(", packing: " + item.packing().pack());
			System.out.println(", price: " + item.price());
		}
	}
	
	public List<Item> getLsItem() {
		return lsItem;
	}

	public void setLsItem(List<Item> lsItem) {
		this.lsItem = lsItem;
	}
	
	
	
}

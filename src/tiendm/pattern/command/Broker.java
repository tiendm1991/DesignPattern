package tiendm.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Order> lsOrder = new ArrayList<>();
	public void takeOrder(Order order){
		lsOrder.add(order);
	}
	public void placeOrder(){
		for(Order order: lsOrder){
			order.execute();
		}
		lsOrder.clear();
	}
}

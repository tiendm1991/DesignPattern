package tiendm.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> mementoList = new ArrayList<>();
	public void add(Memento mmemento){
		mementoList.add(mmemento);
	}
	public Memento get(int index){
		return mementoList.get(index);
	}
}

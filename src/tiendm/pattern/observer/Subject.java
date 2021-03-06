package tiendm.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<>();
	private int state;
	
	public List<Observer> getObservers() {
		return observers;
	}
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObserver();
	}
	
	public void attach(Observer obs){
		observers.add(obs);
	}
	
	public void notifyAllObserver(){
		for(Observer obs : observers){
			obs.update();
		}
	}
	
}

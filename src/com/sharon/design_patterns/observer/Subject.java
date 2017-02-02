package com.sharon.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

import com.sharon.design_patterns.observer.observers.Observer;

//Subject has methods to attach and detach observers to itself, to notify observers of a any change in itself (in its state)
public class Subject{
	
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState(){
		return state;
	}
	
	public void setState(int state){
		this.state = state;
		notifyAllObservers();
	}
	
	public void registerObserver(Observer observer){
		observers.add(observer);
	}
	
	public void notifyAllObservers(){
		for (Observer observer : observers) {
			observer.notifyOfChange();
		}
	}

}

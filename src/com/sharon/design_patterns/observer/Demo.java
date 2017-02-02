package com.sharon.design_patterns.observer;

import com.sharon.design_patterns.observer.observers.BlueObserver;
import com.sharon.design_patterns.observer.observers.GreenObserver;
import com.sharon.design_patterns.observer.observers.RedObserver;

//The observer pattern is a software design pattern in which
//an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes

public class Demo {
	
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new BlueObserver(subject);
		new RedObserver(subject);
		new GreenObserver(subject);
		
		System.out.println("First state change of subject: 50");
		subject.setState(50);
		
		System.out.println("---------------------------------------------");
		
		System.out.println("First state change of subject: 100");
		subject.setState(50);
		
	}

}

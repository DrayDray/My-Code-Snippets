package com.sharon.design_patterns.observer.observers;

import com.sharon.design_patterns.observer.Subject;

public class RedObserver extends Observer{

	public RedObserver(Subject subject){
		this.subject = subject;
		this.subject.registerObserver(this);
	}
	
	@Override
	public void notifyOfChange() {
		System.out.println("Red " + subject.getState());
	}

}

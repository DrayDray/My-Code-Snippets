package com.sharon.design_patterns.observer.observers;

import com.sharon.design_patterns.observer.Subject;

public class BlueObserver extends Observer{

	//a new observer receives its subject as a parameter
	public BlueObserver(Subject subject){
		
		//assign the subject to our observer
		this.subject = subject;
		
		//register to the subject's list of observers
		this.subject.registerObserver(this);
	}
	
	//called when the subject has been changed
	@Override
	public void notifyOfChange() {
		System.out.println("Blue " + subject.getState());
	}

}

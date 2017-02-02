package com.sharon.design_patterns.observer.observers;

import com.sharon.design_patterns.observer.Subject;

public class GreenObserver extends Observer{

	public GreenObserver(Subject subject){
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void notifyOfChange() {
		System.out.println("Green " + subject.getState());
	}

}

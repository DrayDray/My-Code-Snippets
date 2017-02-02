package com.sharon.design_patterns.observer.observers;

import com.sharon.design_patterns.observer.Subject;

//Any concrete observer will extend Observer
public abstract class Observer {
	
	//a concrete observer will have a subject it watches
	protected Subject subject;
	
	//and a function notifyOfChange() that gets called when a change occurs in the subject
	public abstract void notifyOfChange();

}

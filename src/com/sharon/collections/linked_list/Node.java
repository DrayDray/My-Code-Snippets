package com.sharon.collections.linked_list;

public class Node {
	
	//Components of a Linked List:
	// 1. Data
	public String data;
	// 2. Memory Reference/Pointer
	private Node next;
	
	public Node(String value, Node next) {
		super();
		this.data = value;
		this.next = next;
	}
	
	public String getValue() {
		return data;
	}
	
	public void setValue(String value) {
		this.data = value;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
}


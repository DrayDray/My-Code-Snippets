package com.sharon.collections.linked_list_simple;

public class Node {
	
	//Components of a Linked List:
	// 1. Data
	public int value;
	// 2. Memory Reference/Pointer
	private Node next;
	
	public Node(int newValue, Node newNext) {
		this.value = newValue;
		this.next = newNext;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int newValue) {
		this.value = newValue;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node newNext) {
		this.next = newNext;
	}

	public boolean isValueExists(int num) {
		
		//We found the value
		if (value == num){
			return true;
		}
		
		//We reached the end of the list without finding the value
		if (next == null){
			return false;
		}
		
		//move on to the next node to search for the value
		return next.isValueExists(num);
	}
	
}


package com.sharon.collections.linked_list;

//allows us to do various things to a LinkedList
public class MyLinkedList {

	//the head is always keeping track of where is the front of the list (the first value in the list)
	private Node head;
	
	//inserting a node at the front of the list
	public void insertAtFront(String value){
		Node newNode = new Node(value, null);
		
		if(this.head == null){
			this.head = newNode;
		}
		else{
			newNode.setNext(head);
			head = newNode;
		}
	}
	
	//inserting a node at the end of a linkedList
	public void insertLast(String value){
		Node newNode = new Node(value, null);
		
		//if there are no nodes in the list yet:
		if(head == null){
			head = newNode;
		}
		else{
			//current serves as a temporary listNode variable in order to traverse the list until the last node
			Node current = head;
			while(current.getNext() != null){
				current = current.getNext();
			}
			current.setNext(newNode);
		}
	}
	
	public void printList(){
		Node current = head;
		while(current.getNext() != null){
			System.out.print(current.getValue() + " --> ");
			current = current.getNext();
		}
		System.out.print(current.getValue());
	}
}

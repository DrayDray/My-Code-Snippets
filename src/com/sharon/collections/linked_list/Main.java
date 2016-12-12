package com.sharon.collections.linked_list;

//Implementing our own LinkedList (without Java's built in LinkedList class)
public class Main {

	public static void main(String[] args) {
		MyLinkedList list1 = new MyLinkedList();
		list1.insertAtFront("Apple");
		list1.insertAtFront("Banana");
		list1.insertAtFront("Cherry");
		list1.insertAtFront("Watermelon");
		
		System.out.print("List 1: ");
		list1.printList();
		
		MyLinkedList list2 = new MyLinkedList();
		list2.insertLast("Apple");
		list2.insertLast("Banana");
		list2.insertLast("Cherry");
		list2.insertLast("Watermelon");
		
		System.out.print("\nList 2: ");
		list2.printList();
	}

}

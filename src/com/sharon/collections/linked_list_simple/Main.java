package com.sharon.collections.linked_list_simple;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import com.sharon.collections.linked_list_simple.Node;

//Basic creation and printing of our own LinkedList (without Java's built in LinkedList class)
public class Main {

	public static void main(String[] args) {

//		Node node4 = new Node(5, null);
//		Node node3 = new Node(8, node4);
//		Node node2 = new Node(8, node3);
//		Node start = new Node(4, node2);

//		Or:
		Node start = new Node(4, 
				new Node(8, 
				new Node(8, 
				new Node(5, null))));

		printLinkedList(start);

		// Check whether we have a specific number inside the linked list
		String strNum = JOptionPane.showInputDialog("Please enter a number to be searched in the list");
		int num = Integer.parseInt(strNum);
		
		if (start.isValueExists(num)){
			System.out.println("\nThe value exists");
		}
		else{
			System.out.println("\nThe value does not exist");
		}
	}

	public static void printLinkedList(Node node){
		while(node!=null){
			System.out.print(node.getValue()+" ");
			node = node.getNext();
		}
	}
}

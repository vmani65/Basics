package com.Collections;

public class CustomLinkedList {
	Node head;
	
	public static class Node {
		Node next;
		int data;
		
		Node(int d){
			this.data = d;
			next = null;
		}
	}
	
	public void add(int value){
		if(head.next == null)
			head.data = value;
	}
	
	public void printAll(){
		Node temp = head;
		while(temp.data != 0){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		CustomLinkedList lList = new CustomLinkedList();
		
		Node first = new Node(1);
		Node second = new Node(1);
		Node third = new Node(1);
		
		lList.head = first;
		first.next = second;
		second.next = third;
		third.next = null;
		
		lList.printAll();
	}
}

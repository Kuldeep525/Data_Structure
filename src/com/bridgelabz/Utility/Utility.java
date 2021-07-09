package com.bridgelabz.Utility;

import Queue.ListNode;

public class Utility {
	
	private ListNode head; 
	// listNode is a inner class
	public static class ListNode{
		public int data;   //data may be generics type
		private ListNode next;	
		
		public ListNode(int data) {
	    this .data = data;
	    this.next = null;   //initially all next elemnet have null value
	    	}

	}
	
	public void printLinkedList() {
		ListNode pointer = head;
		while ( pointer != null) {   //while my pointer becomes null till check
			System.out.print(pointer.data+ "==>");
			pointer = pointer.next;
		}
		System.out.println( "null");
		
	}


	public void insertData(int value) {
		ListNode newNode =  new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void append(int value ) {
		ListNode newNode =  new ListNode(value);
		if (head == null) {
			head  = newNode;
			return;
		}
		ListNode current = head ;
		while( current.next  !=  null  ) {
			current = current.next;
			
		}
		current.next = newNode;
	}

	public void insert(int position , int value) {
		ListNode node = new ListNode(value);
		if (position == 1) {
			node.next = head;
			head = node;
			
		}else {
			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
				
			}
			ListNode current = previous.next;
			previous.next = node;
			node.next = current;	
		}
	}
	public ListNode deleteFirst() {
		if(head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
		
	}
	public ListNode deleteLast() {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		while(current.next != null) {
			previous = current ;
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	public boolean  find(int searchKey) {
		if (head == null) {
			return false;
		}
		ListNode current = head;
		while(current != null) {
			if(current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
		
	}
	
	public void delete(int position) {
		if(position == 1 ) {
			head = head.next;
		}
		else {
			ListNode previous = head;
			int count = 1;
			while(count < position - 1) {
				previous  = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next  =current.next;		
		}
	}
	
	public int length() {
		if(head == null) {
			return 0;
		}
	
			int count = 0 ;
			ListNode pointer = head;
			while(pointer != null) {
				count++;	
				pointer = pointer.next;
			}
			return count;	
	}
	
	public void sortedList() {
		ListNode current = head , index  = null;
		int temp; 
		if(head == null) {
			return;
		}
		else {
			while(current != null) {
				index = current.next;
			
			while (index != null) {
				if(current.data > index.data) {
					temp =  current.data;
					current.data = index.data;
					index.data = temp;
				}
				index = index.next;
			}
			current = current.next;
			}
		}
		
	}
	///stack methods
	
	private ListNode top;
	private int length;
	
	public class ListNodes {
		private int data;
		private ListNode next;
		
		public ListNodes(int data) {
				this.data = data;
				
		}
	}
		public Utility() {
			top = null;
			length = 0;
		}
		
		public int lengths() {
			return length;
		}
		
		public boolean isEmpty() {
			return length == 0;
		}
		public void push(int data) {
			ListNode temp = new ListNode(data);
			temp.next = top;
			top = temp;
			length++;
		}
		public int pop() {
			int result = top.data;
			top = top.next;
			length--;
			return result;
		}
		public int peek() {
			return top.data;
		}
		

		

}

package com.bridgelabz.program;

public class QueueDequeue {


	private ListNode front;
	private ListNode rear;
	private int length;
	
	public QueueDequeue() {
		this.front= null;
		this.rear = null;
		this.length = 0;
	}
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	public void enqueue(int data) {
		ListNode temp = new ListNode(data);
		if(isEmpty()) {
			front = temp;
		}
		else {
			rear.next = temp;
		}
		rear = temp ;
		length++;
	}
	public void print() {
		if(isEmpty()) {
			return;
		}
		ListNode pointer = front;
		while(pointer != null) {
			System.out.print(pointer.data + "-->");
			pointer = pointer.next;
			
		}
		System.out.print("null");
	}
	public int dequeue() {
		int result = front.data;
		front = front.next;
		if(front==null) {
			rear = null;
		}
		length--;
		return result;
	}
	public static void main(String [] args) {
		QueueDequeue queue = new QueueDequeue();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		
		queue.print();
		System.out.println();
		queue.dequeue();
		queue.print();
		
		
	}


}


package com.bridgelabz.program;

public class HashTable {
	
	private HashNode []Buckets;
	private int numOfBuckets;       //capacity
	private int size ;   //number of key value pair
	
	
	public HashTable() {
		this(10);     //default capacity
	}
	public HashTable(int capacity) {
		this.numOfBuckets = capacity;
		Buckets = new HashNode[numOfBuckets];   // array of buckets
		this.size = 0;
	}
	
	private class HashNode {
		private Integer key;
		private String value;
		private HashNode next;
		
		public HashNode(Integer key , String value ){
			this.key = key;
			this.value = value;
		}
	}
	
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public int getBucketIndex(Integer key) {
		return key%numOfBuckets;
	}
	public void put(Integer key,String value) {
		if(key == null || value == null) {
			throw new IllegalArgumentException("key or value is null");
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = Buckets[bucketIndex];
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = value;
			return;
		}
		head = head.next;
		}
		size++;
		head = Buckets[bucketIndex];             //index value to head
		HashNode node = new HashNode(key,value);
		node.next = head;
		 Buckets[bucketIndex]=  node;
	}
	public String get(Integer key) {
		if(key == null) {
			throw new IllegalArgumentException("key or value is null");
		}
		int bucketIndex  = getBucketIndex(key);
		HashNode  head = Buckets[bucketIndex];
		while(head != null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;	
	}
	public String remove(Integer key) {
		if(key == null) {
			throw new IllegalArgumentException("key or value is null");
		}
		int bucketIndex  = getBucketIndex(key);
		HashNode  head = Buckets[bucketIndex];
		HashNode previous = head;
		while(head != null) {
			if(head.key.equals(key)) {
				break;
			}
			previous = head;
			head = head.next;
		}
		if(head == null) {
			return null;
		}
		size--;
		if(previous != null) {
			previous.next = head.next;
		}else {
			Buckets[bucketIndex] = head.next;
		}
		return null;
		
		
	}
	public static void main(String[] args) {
		HashTable table = new HashTable(10);
		table.put(20, "Anil ");
		table.put(30, "kuldeep");
		table.put(50,"heyu");
		table.put(90, "suresh");
		table.put(70, "ramesh");
		table.put(90, "kamlesh");
		System.out.println("size of table is "+ table.size());
		System.out.println("your value is "+ table.get(90));
		System.out.println("your value is "+ table.get(50));
		System.out.println("size of table is "+ table.remove(20));
		System.out.println("size of table is "+ table.remove(90));
		System.out.println("size of table is "+ table.size());
		
	}

}


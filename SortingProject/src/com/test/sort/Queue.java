package com.test.sort;

public class Queue {
	
	private LinkedListNode head;
	
	private LinkedListNode tail;

	public LinkedListNode getHead() {
		return head;
	}

	public void setHead(LinkedListNode head) {
		this.head = head;
	}

	public LinkedListNode getTail() {
		return tail;
	}

	public void setTail(LinkedListNode tail) {
		this.tail = tail;
	}
	
	public Queue(LinkedListNode head, LinkedListNode tail){
		this.head = head;
		this.tail = tail;
	}
	
	
	public boolean add(int data){
		boolean added = false;
		LinkedListNode newNode = new LinkedListNode();
		newNode.setData(data);
		if(tail != null){
			tail.setNext(newNode);
			tail = newNode;
			added =true;
		}
		if(head == null){
			head = newNode;
			added =true;
		}
		return added;
	}
	
	public LinkedListNode remove(){
		LinkedListNode headNode = null;
		if(head != null){
			headNode = head;
			LinkedListNode nextToHead = head.getNext();
			head = nextToHead;
		}
		return headNode;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public LinkedListNode peek(){
		LinkedListNode headNode = null;
		if(head != null){
			headNode = head;
		}
		return headNode;
	}
	
	
	
}

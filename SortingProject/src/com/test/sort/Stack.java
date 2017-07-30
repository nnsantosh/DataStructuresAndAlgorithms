package com.test.sort;

public class Stack {

	
	private LinkedListNode top;
	
	public Stack(LinkedListNode top){
		this.top = top;
	}
	
	public LinkedListNode getTop() {
		return top;
	}

	public void setTop(LinkedListNode top) {
		this.top = top;
	}
	
	public boolean empty(){
		if(null == top){
			return true;
		}else
			return false;
	}
	
	public LinkedListNode peek(){
		return top;
	}
	
	public LinkedListNode pop(){
		LinkedListNode originalTop = top;
		if(top != null){
			LinkedListNode nextToTop = top.getNext();
			top = nextToTop;
		}
		return originalTop;
		
	}
	
	public LinkedListNode push(int data){
		LinkedListNode newNode = new LinkedListNode();
		newNode.setData(data);
		if(null != top){
			LinkedListNode originalTop = top;
			newNode.setNext(originalTop);
			top = newNode;
		}else{
			top = newNode;
		}
		return top;
	}
	
	public void printStack(){
		LinkedListNode currentNode = top;
		//System.out.println("Stack element top: "+currentNode.getData());
		if(currentNode != null){
			while(currentNode.getNext() != null){
				System.out.println("Stack element: "+currentNode.getData());
				currentNode = currentNode.getNext();
			}
			System.out.println("Stack element: "+currentNode.getData());
		}else{
			System.out.println("Stack is empty!");
		}
	}
}

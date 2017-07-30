package com.test.sort;

public class TestDataStructuresClient {
	
	public static void main(String[] args){
		testStackImpl();
	}
	
	public static void testStackImpl(){
		
		LinkedListNode top = new LinkedListNode();
		top.setData(8);
		
		Stack stack = new Stack(top);
		stack.push(9);
		stack.printStack();
		stack.pop();
		stack.pop();
		stack.printStack();
		boolean isStackEmpty = stack.empty();
		System.out.println("TestDataStructuresClient.testStackImpl() is stack empty: "+isStackEmpty);
		
	}

}

package com.test.sort;

public class BinaryTree {
	
	private BinaryNode rootNode;
	
	
	
	public BinaryNode getRootNode() {
		return rootNode;
	}



	public void setRootNode(BinaryNode rootNode) {
		this.rootNode = rootNode;
	}



	public BinaryTree(BinaryNode node){
		this.rootNode = node;
	}
	
	
	public void insertNode(int data){
		if(rootNode == null){
			rootNode = new BinaryNode(data);
		}else{
			rootNode.insertNode(data);
		}
	}
	
	public boolean containsNode(int data){
		if(rootNode == null){
			return false;
		}else{
			return rootNode.containsNode(data);
		}
	}
	

}

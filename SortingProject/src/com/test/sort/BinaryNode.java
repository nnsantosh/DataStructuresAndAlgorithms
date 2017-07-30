package com.test.sort;

public class BinaryNode {

	private int data;
	private BinaryNode leftNode;
	private BinaryNode rightNode;
	
	public BinaryNode(int data){
		this.data = data;
	}
	
	
	
	public int getData() {
		return data;
	}



	public void setData(int data) {
		this.data = data;
	}



	public BinaryNode getLeftNode() {
		return leftNode;
	}



	public void setLeftNode(BinaryNode leftNode) {
		this.leftNode = leftNode;
	}



	public BinaryNode getRightNode() {
		return rightNode;
	}



	public void setRightNode(BinaryNode rightNode) {
		this.rightNode = rightNode;
	}



	public void insertNode(int data){
		BinaryNode newNode = new BinaryNode(data);
		if(data <= this.data){
			if(this.leftNode == null){
				this.leftNode = newNode;
			}else{
				this.leftNode.insertNode(data);
			}
		}else{
			if(this.rightNode == null){
				this.rightNode = newNode;
			}else{
				this.rightNode.insertNode(data);
			}
		}
		
	}
	
	public boolean containsNode(int data){
		boolean containsNode = false;
		if(data < this.data){
			if(this.leftNode != null){
				if(this.leftNode.data == data){
					containsNode = true;
					return containsNode;
				}else
				return this.leftNode.containsNode(data);
			}
		}else if(data < this.data){
			if(this.rightNode != null){
				if(this.rightNode.data == data){
					containsNode = true;
					return containsNode;
				}else
				return this.rightNode.containsNode(data);
			}
		}else{
			containsNode = true;
			return containsNode;
		}
		
		return containsNode;
	}
	
}

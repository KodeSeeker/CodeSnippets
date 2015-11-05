package com.test;

public class TreeNode {

	 int data;
	private TreeNode left;
	private TreeNode right;
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	 
	
	public TreeNode(int data)
	{
		this.data=data;
		this.setLeft(null);
		this.setRight(null);
	}
	
}

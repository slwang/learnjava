package com.wsl.learnJava.tree;

public class TreeNode {
	private String value;
	private TreeNode left;
	private TreeNode right;
	
	TreeNode(String value){
		this.value = value;
	}
	
	
	public TreeNode() {
	}


	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
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
	

}

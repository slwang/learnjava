package com.wsl.learnJava.tree;

import java.util.Stack;

/*
 * 运算表达式	二叉树	返回的前缀表达式
a+b*c-d	 
-,+,a,*,b,c,d




*/
public class TreeTOString { 
	public static void main(String[] args) {
		TreeNode b = new TreeNode("b");
		TreeNode c = new TreeNode("c");
		TreeNode mult = new TreeNode("*");
		mult.setLeft(b);
		mult.setRight(c);
		TreeNode a = new TreeNode("a");
		
		TreeNode add = new TreeNode("+");
		add.setLeft(a);
		add.setRight(mult);
		
		TreeNode root = new TreeNode("-");
		TreeNode d = new TreeNode("d");
		root.setLeft(add);
		root.setRight(d);
		System.out.println(toPrefixExpression(root));
		
		System.out.println(toPrefixExpression2(root));
		
	}
	
	
	public static String toPrefixExpression(TreeNode root){
		if (root == null){
			return "";
		}
			
		String exp = root.getValue();
		if (root.getLeft()!= null){
			exp+=","+toPrefixExpression(root.getLeft());
		}
		if (root.getRight()!= null){
			exp+=","+toPrefixExpression(root.getRight());
		}
		return exp;
	}
	
	
	static String toPrefixExpression2(TreeNode root){
		StringBuilder exp = new StringBuilder();//.String is ok too!
		//String str = "";
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode node = stack.pop();
			exp.append(",").append(node.getValue());
			//str+=","+node.getValue();
			if(node.getRight() != null)
				stack.push(node.getRight());
			if(node.getLeft() != null)
				stack.push(node.getLeft());
		}
		return exp.substring(1);
		//return str.substring(1);
	}


}

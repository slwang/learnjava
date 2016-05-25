package com.wsl.learnJava.linkedlist;

/**
 * 单链表节点类
 * @author wsl
 *
 */
public class SLNode implements INode {
	private Object element;
	private SLNode next;
	/**
	 * 默认构造函数
	 */
	public SLNode(){
		this(null,null);
	}
	
	public SLNode(Object ele, SLNode next){
		this.element = ele;
		this.next = next;
	}

	public Object getData() {
		// TODO Auto-generated method stub
		return this.element;
	}

	public void setData(Object obj) {
		this.element = obj;
		
	}
	
	public SLNode getNext() {
		return next;
	}
	public void setNext(SLNode next) {
		this.next = next;
	}


}

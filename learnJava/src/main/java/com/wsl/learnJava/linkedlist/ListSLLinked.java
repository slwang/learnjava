package com.wsl.learnJava.linkedlist;

import com.wsl.learnJava.jds.DefaultStrategy;
import com.wsl.learnJava.jds.IList;
import com.wsl.learnJava.jds.IStrategy;

/**
 * 单链表类的实现
 * @author wsl
 *
 */
public class ListSLLinked implements IList {
	private IStrategy strategy;//数据元素比较策略
	private SLNode head;//单链表首节点引用
	private int size;//新型表中数据原色的个数
	

	public ListSLLinked(){
		this(new DefaultStrategy());
		
	}
	
	public ListSLLinked(IStrategy startegy){
		this.strategy = strategy;
		head = new SLNode();
		size =0;
	}
	
	private SLNOde
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contains(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	public int indexOf(Object e) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void insert(int i, Object e) {
		// TODO Auto-generated method stub
		
	}

	public boolean insertBefore(Object obj, Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean insertAfter(Object obj, Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object replace(int i, Object e) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}

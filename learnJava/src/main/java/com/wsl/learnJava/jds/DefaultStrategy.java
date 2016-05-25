package com.wsl.learnJava.jds;

/**
 * 默认比较策略类
 * @author wsl
 *
 */
public class DefaultStrategy implements IStrategy {

	public boolean equal(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		return obj1.equals(obj2);
	}

	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		return obj1.toString().compareTo(obj2.toString());
	}

}

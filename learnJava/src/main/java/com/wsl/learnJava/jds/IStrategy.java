package com.wsl.learnJava.jds;

/**
 * 对象比较策略接口
 * 实现各种不同数据元素相互之间独立的比较策略的单独比较
 * 优点：  不使用这个
 * @author wsl
 *
 */
public interface IStrategy {
	//判断两个数据元素是否相等
	public boolean equal (Object obj1, Object obj2);
	
	/**
	 * 比较两个数据元素的大小 
	 * 如果obj1 < obj2 返回 -1
	 * 如果obj1 = obj2 返回 0
	 * 如果obj1 > obj2 返回 1
	 */
	public int compare(Object obj1, Object obj2);
}

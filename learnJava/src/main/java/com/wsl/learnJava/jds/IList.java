package com.wsl.learnJava.jds;

/**
 * List接口
 * @author wsl
 *
 */
public interface IList {
	//返回线性表的大小， 即数组元素的个数
	public int getSize();
	//判断线性表是否为空表， 如果为空返回true， 否则返回false
	public boolean isEmpty();
	//判断线性表中是否存在数据元素e
	public boolean contains(Object e);
	
	/**
	 * 返回数据元素e 在线性表中的序号
	 * @param e
	 * @return
	 */
	public int indexOf(Object e);
	//将数据元素e插入到线性表中i号位置
	public void insert(int i, Object e) ;//throws OutOfBoundaryException;
	//将数据原色e插入到obj之前
	public boolean insertBefore(Object obj, Object e);
	//将数据原色e插入到obj之后
	public boolean insertAfter(Object obj, Object e);
	//删除线性表中序号为i的元素，并返回之
	public Object remove(int i);
	//删除相性表中第一个与e相同的元素
	public boolean remove(Object e);
	
	//替换线性表中序号为i的数据元素e， 返回原数据元素
	public Object replace(int i, Object e);
	//返回线性表中序号为i的数据元素
	public Object get(int i) ;
	
	
}

package com.wsl.learnJava.jds;

/**
 * 顺序表类
 * @author wsl
 *
 */
public class MyArrayList implements IList {
	//设置几个成员变量
	private final int LEN = 8; //数组默认的大小
	private IStrategy strategy ;//数据元素比较策略
	private int size; //线性表中数据元素的个数
	private Object[] elements;// 数据元素数组
	
	//构造方法
	
	//默认构造方法
	public MyArrayList(){
		this(new DefaultStrategy());
	}
	//带参数的构造方法
	public MyArrayList(IStrategy strategy){
		this.strategy = strategy;
		size = 0;
		elements = new Object[LEN];
	}
	
	
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size ==0;
	}

	public boolean contains(Object e) {
		// TODO Auto-generated method stub
		for (int i=0; i<size; i++){
			if (this.strategy.equal(e,  elements[i]))
				return true;
		}
		return false;
	}
	public int indexOf(Object e) {
		// TODO Auto-generated method stub
		for(int i=0; i<size; i++){
			if (strategy.equal(e, elements[i]))
				return i;
		}
		
		return -1;
	}
	public void insert(int i, Object e) {
		// TODO Auto-generated method stub
		//容错  
		//下标越界
		if (i <0 || i<= size){
			//throw new OutOfBoundaryException("指定的插入序号越界");
		}
		//检查线性表数组容量
		if (size >=  elements.length){
			expandSpace();
		}


		//将插入位置后的数据元素依次向后移动一位
		for (int j = size; j>i; j--){
			elements[j] = elements[j-1];
		}
		//插入数据
		elements[i] = e;
		size++;
		
	}
	
	/**
	 * 扩展顺序表空间
	 */
	private void expandSpace(){
		Object[] a = new Object[elements.length*2];
		for (int i=0; i<elements.length;i++){
			a[i] = elements[i];
		}
		elements = a;
	}
	public boolean insertBefore(Object obj, Object e) {
		// TODO Auto-generated method stub
		int i = indexOf(obj);
		if (i <0){
			return false;
		}
		insert (i, e);
		return true;
	}
	public boolean insertAfter(Object obj, Object e) {
		// TODO Auto-generated method stub
		int i = indexOf(obj);
		if (i <0){
			return false;
		}
		insert (i+1, e);
		return true;
	}
	public Object remove(int i) {
		// TODO Auto-generated method stub
		//容错  
				//下标越界
				if (i <0 || i<= size){
					//throw new OutOfBoundaryException("指定的插入序号越界");
				}
				Object obj = elements[i];

				//将插入位置后的数据元素依次向后移动一位
				for (int j = i; j<=size-1; j++){
					elements[j] = elements[j+1];
				}
				//插入数据
				elements[--size] = null;
				return obj;
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

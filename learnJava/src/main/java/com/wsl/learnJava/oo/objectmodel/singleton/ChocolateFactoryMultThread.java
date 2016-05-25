package com.wsl.learnJava.oo.objectmodel.singleton;
/*
 * 一个锅炉，判空要用单例
 * */
public class ChocolateFactoryMultThread {
	private boolean empty;
	private boolean boiled;
	//同步锁解决多线程问题，消耗资源比较多
	/*public static ChocolateFactoryMultThread  uniqueInstance = null;
	private ChocolateFactoryMultThread(){
		empty = true;
		boiled = false;
	}
	
	public static synchronized ChocolateFactoryMultThread getInstance(){
		if (uniqueInstance == null){
			uniqueInstance = new ChocolateFactoryMultThread();
		}
		return uniqueInstance;
	}*/
	/*//“急切”创建实例
	public static ChocolateFactoryMultThread  uniqueInstance = new ChocolateFactoryMultThread();
	private ChocolateFactoryMultThread(){
		empty = true;
		boiled = false;
	}
	
	public static  ChocolateFactoryMultThread getInstance(){
		if (uniqueInstance == null){
			uniqueInstance = new ChocolateFactoryMultThread();
		}
		return uniqueInstance;
	}*/
	//双重检查加锁
	public volatile static ChocolateFactoryMultThread  uniqueInstance = null;
	private ChocolateFactoryMultThread(){
		empty = true;
		boiled = false;
	}
	
	public static  ChocolateFactoryMultThread getInstance(){
		if (uniqueInstance == null){
			synchronized (ChocolateFactoryMultThread.class){
				if (uniqueInstance == null){
					uniqueInstance = new ChocolateFactoryMultThread();
				}
			}
			
			
		}
		return uniqueInstance;
	}
	public void fill(){
		if (empty){
			//添加原料巧克力动作
			empty = false;
			boiled = false;
		}
	}
	
	public void boil(){
		if ((!empty)&&(!boiled)){
			//煮沸
			boiled = true;
		}
	}
	
	public void drain(){
		if ((!empty)&&boiled){
			//排除巧克力
			empty = true;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

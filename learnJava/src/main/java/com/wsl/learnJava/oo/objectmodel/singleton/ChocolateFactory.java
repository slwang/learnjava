package com.wsl.learnJava.oo.objectmodel.singleton;
/*
 * 一个锅炉，判空要用单例
 * */
public class ChocolateFactory {
	private boolean empty;
	private boolean boiled;
	public static ChocolateFactory  uniqueInstance = null;
	private ChocolateFactory(){
		empty = true;
		boiled = false;
	}
	
	public static ChocolateFactory getInstance(){
		if (uniqueInstance == null){
			uniqueInstance = new ChocolateFactory();
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

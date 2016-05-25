package com.wsl.learnJava.oo.objectmodel.singleton;

public class Singleton {
	private static Singleton uniquInstance = null;
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if (uniquInstance == null){
			uniquInstance = new Singleton();
		}
		return uniquInstance;
	}
	
}

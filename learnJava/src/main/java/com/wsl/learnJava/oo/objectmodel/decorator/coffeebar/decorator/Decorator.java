package com.wsl.learnJava.oo.objectmodel.decorator.coffeebar.decorator;

import com.wsl.learnJava.oo.objectmodel.decorator.coffeebar.Drink;

public class Decorator extends Drink{
	private Drink obj;
	
	public Decorator(Drink obj){
		this.obj = obj;
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice()+obj.getPrice();
	}
	
	@Override
	public String getDescription(){
		return super.getDescription()+super.getPrice()+"&&"+obj.getDescription()+obj.getPrice();
	}

}

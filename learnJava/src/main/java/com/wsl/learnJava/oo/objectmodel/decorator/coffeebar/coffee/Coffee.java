package com.wsl.learnJava.oo.objectmodel.decorator.coffeebar.coffee;

import com.wsl.learnJava.oo.objectmodel.decorator.coffeebar.Drink;

/*
 * 引进新单品时只需集成Coffee，不影响其他单品
 * */
public class Coffee extends Drink{

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

}

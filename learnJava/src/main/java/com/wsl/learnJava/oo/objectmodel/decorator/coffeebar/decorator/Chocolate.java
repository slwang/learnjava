package com.wsl.learnJava.oo.objectmodel.decorator.coffeebar.decorator;

import com.wsl.learnJava.oo.objectmodel.decorator.coffeebar.Drink;

public class Chocolate extends Decorator{

	public Chocolate(Drink obj) {
		super(obj);
		super.setDescription("Chocolate");
		super.setPrice(3.0f);
	}

}

package com.wsl.learnJava.oo.objectmodel.decorator.coffeebar.decorator;

import com.wsl.learnJava.oo.objectmodel.decorator.coffeebar.Drink;

public class Soy extends Decorator{

	public Soy(Drink obj) {
		super(obj);
		super.setDescription("Soy");
		super.setPrice(5.0f);
	}

}

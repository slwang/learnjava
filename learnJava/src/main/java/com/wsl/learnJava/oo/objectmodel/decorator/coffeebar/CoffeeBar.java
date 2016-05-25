package com.wsl.learnJava.oo.objectmodel.decorator.coffeebar;

import com.wsl.learnJava.oo.objectmodel.decorator.coffeebar.coffee.Decaf;
import com.wsl.learnJava.oo.objectmodel.decorator.coffeebar.coffee.LongBlack;
import com.wsl.learnJava.oo.objectmodel.decorator.coffeebar.decorator.Chocolate;
import com.wsl.learnJava.oo.objectmodel.decorator.coffeebar.decorator.Milk;

public class CoffeeBar {
	public static void main(String[] args){
		Drink order;
		order = new Decaf();
		System.out.println("order1 price: "+order.getPrice());
		System.out.println("order1 desc: "+order.getDescription());
		
		
		order = new LongBlack();
		order = new Milk(order);
		order = new Chocolate(order);
		order = new Chocolate(order);
		System.out.println("order2 price: "+order.getPrice());
		System.out.println("order2 desc: "+order.getDescription());

	}

}

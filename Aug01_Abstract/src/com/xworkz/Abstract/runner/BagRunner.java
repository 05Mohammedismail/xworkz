package com.xworkz.Abstract.runner;

import com.xworkz.Abstract.abstractClasses.Bag;
import com.xworkz.Abstract.implementations.Bag.Puma;
import com.xworkz.Abstract.implementations.Bag.WildCraft;

public class BagRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Bag Runner\n");
		
		Bag b1 = new WildCraft();
		b1.getBrand();
		b1.getPrice();
		b1.getType();
		
		System.out.println("* * * * * * * * * * * *");
		
		Bag b2 = new Puma();
		b2.getBrand();
		b2.getPrice();
		b2.getType();
	}

}

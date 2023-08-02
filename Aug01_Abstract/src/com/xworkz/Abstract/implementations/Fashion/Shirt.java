package com.xworkz.Abstract.implementations.Fashion;

import com.xworkz.Abstract.abstractClasses.Fashion;

public class Shirt extends Fashion {

	@Override
	public void getClothType() {
		System.out.println("Cloth Type is Shirt");
	}
	
	@Override
	public void getBrand() {
		System.out.println("Brand is RareRabbit");
	}
	
}

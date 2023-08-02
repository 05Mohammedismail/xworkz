package com.xworkz.Abstract.implementations.car;

import com.xworkz.Abstract.abstractClasses.Car;

public class Toyota extends Car {

	@Override
	public void getCarBrand() {
		System.out.println("The brand of the car is Toyota");
	}
	
	@Override
	public void getColor() {
		System.out.println("The color of this car is Black");
	}

}

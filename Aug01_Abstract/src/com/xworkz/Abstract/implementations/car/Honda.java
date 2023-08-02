package com.xworkz.Abstract.implementations.car;

import com.xworkz.Abstract.abstractClasses.Car;

public class Honda extends Car{

	@Override
	public void getCarBrand() {
		System.out.println("The brand of this car is Honda");
	}
	
	@Override
	public void getColor() {
		System.out.println("The color of this car is Silver ");
	}

}

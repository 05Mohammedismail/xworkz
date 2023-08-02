package com.xworkz.Abstract;
import com.xworkz.Abstract.abstractClasses.Car;
import com.xworkz.Abstract.implementations.car.*;

public class CarRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Car Runner\n");
		
		Car car1 = new Toyota();
		car1.getCarBrand();
		car1.getColor();
		car1.getPrice();
		
		System.out.println("* * * * * * * * * * * * * * * * *");
		
		Car car2 = new Honda();
		car2.getCarBrand();
		car2.getColor();
		car2.getPrice();
	}

}

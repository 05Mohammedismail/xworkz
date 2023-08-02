package com.xworkz.Abstract.runner;

import com.xworkz.Abstract.abstractClasses.Fashion;
import com.xworkz.Abstract.implementations.Fashion.Lehenga;
import com.xworkz.Abstract.implementations.Fashion.Shirt;

public class FashionRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Fashion Runner\n");
		
		 Fashion sh1 = new Shirt();
		 sh1.getClothType();
		 sh1.getBrand();
		 sh1.getPrice();
		 
		 System.out.println("* * * * * * * * * * * * *");
		 
		Fashion lehenga1 = new Lehenga();
		 lehenga1.getClothType();
		 lehenga1.getBrand();
		 lehenga1.getPrice();
	}

}

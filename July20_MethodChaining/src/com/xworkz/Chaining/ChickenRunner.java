package com.xworkz.Chaining;

public class ChickenRunner {

	public static void main(String[] args) {

		Chicken c1 = new Chicken(370 , "Hydrabad");
		c1.printInfo();
		
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		
		Chicken c2 = new FarmChicken(250 , "Banglore" , 20 , "Manoj");
		c2.printInfo();
		
		System.out.println("* * * * * * * * * * * * * * * * * * * *");

		
		Chicken c3 = new BroilerChicken(423, "Chennai", false, 2.5);
		c3.printInfo();
	}

}

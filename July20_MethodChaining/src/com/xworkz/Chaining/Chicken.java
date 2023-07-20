package com.xworkz.Chaining;

public class Chicken {
	
	double price;
	String location;
	
	Chicken(double price , String location){
		System.out.println("Running double, String in Chicken");
		this.price = price;
		this.location = location;
	}

	
	void printInfo() {
		System.out.println("Running print info in Chicken\n");
		System.out.println("Chicken price : " + price);
		System.out.println("Chicken Location : " + location);
	}
}

package com.xworkz.Chaining;

public class BroilerChicken extends Chicken{
	
	boolean alive;
	double weight;
	
	public BroilerChicken(double price, String location, boolean alive, double weight) {
		super(price, location);
		this.alive = alive;
		this.weight = weight;
	}
	
	@Override
	void printInfo() {
		System.out.println("Running print Info of Broiler Chicken");
		super.printInfo();
		System.out.println("Chicken alive status : " + alive);
		System.out.println("Chicken weight : " + weight);
		
	}
	

}

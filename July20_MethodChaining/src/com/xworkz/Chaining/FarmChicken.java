package com.xworkz.Chaining;

public class FarmChicken extends Chicken {
	
	int noOfChicken;
	String careTakerName;
	
	
	public FarmChicken(double price, String location, int noOfChicken, String careTakerName) {
		super(price, location);
		this.noOfChicken = noOfChicken;
		this.careTakerName = careTakerName;
	}
	
	@Override
	void printInfo() {
		System.out.println("Running print Info of Farmchicken");
		super.printInfo();
		System.out.println("Number of Chicken : " + noOfChicken);
		System.out.println("Care Taker Name : " + careTakerName);
		
	}
	

}

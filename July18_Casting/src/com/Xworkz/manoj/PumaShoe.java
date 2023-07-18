package com.Xworkz.manoj;

public class PumaShoe extends Shoe {
	
	String model;
	int origin;
	
	public PumaShoe(long price, SizeType size, ColorType color , String model , int origin) {
		super(price, size, color);
		this.model = model;
		this.origin = origin;
	
	}
	void printInfo() {
		System.out.println("Running printinfo in Puma Shoe (Child)");
		System.out.println("Shoe price : " + price);
		System.out.println("Shoe Size : " + size);
		System.out.println("Shoe Color : " + color);
		System.out.println("Shoe Model : " + model);
		System.out.println("Shoe origin : " + origin);

	}
	
	
	
}

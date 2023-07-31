package com.xworkz.Final.app;

public final class Shirt {    
	
	private String brandName;
	private String color;       
	private String shirtType;
	private double price;
	private boolean isSleave;
	private char size;
	
	public Shirt() {
		System.out.println("Running no argument constructor of Shirt");
	}
	
	public Shirt(String brandName, String color, String shirtType) {
		System.out.println("Running string, string, string constructor of Shirt...");
		this.brandName = brandName;
		this.color = color;
		this.shirtType = shirtType;
	}

	public Shirt(String brandName, String color, String shirtType, double price, boolean isSleave, char size) {
		this(brandName, color, shirtType);
		System.out.println("Running string, string, string, double, boolean, char constructor of Shirt...");
		this.price = price;
		this.isSleave = isSleave;
		this.size = size;
	}


	@Override
	public String toString() {
		return "brandName=" + brandName + "\n" + "color=" + color + "\n" + "shirtType=" + shirtType + "\n" + 
				"price=" + price+ "\n" + "isSleave=" + isSleave + "\n" + "size=" + size;
	}
	
	
	
	
}
	

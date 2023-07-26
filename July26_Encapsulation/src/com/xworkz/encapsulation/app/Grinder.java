package com.xworkz.encapsulation.app;

public class Grinder {
	
	private String brandName;
	private String model;
	private double price;
	private String type;
	private String color;
	
	public void setGrinder(String brandName, String model, double price, String type, String color) 
	{
		this.brandName = brandName;
		this.color = color;
		this.model = model;
		this.price = price;
		this.type = type;
	}
	
	 @Override
	public String toString() 
	 {
		return "brandName is = " + brandName + "\n" + "color is = " + color + "\n" + "modelName is = " + model
				+ "\n" + "price is Rs = " + price + "\n" + "type is = " + type;
	}

}

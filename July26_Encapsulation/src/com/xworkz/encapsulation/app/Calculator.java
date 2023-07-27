package com.xworkz.encapsulation.app;

public class Calculator {
	
	private String brandName;
	private double price;
	private String modelName;
	private String type;
	private String color;
	
	public String getBrandName() {
		return brandName;
	}public String getColor() {
		return color;
	}
	public String getModelName() {
		return modelName;
	}
	public double getPrice() {
		return price;
	}
	public String getType() {
		return type;
	}
	
	public void setCalculator(String brandName, double price, String modelName, String type, String color)
	{
		this.brandName = brandName;
		this.color = color;
		this.modelName = modelName;
		this.price = price;
		this.type = type;
	}
	
	
	@Override
	public String toString() {
		return "brandName is = " + brandName + "\n" + "color is = " + color + "\n" + "modelName is = " + modelName 
									+ "\n" + "price is = " + price + "\n" + "type is = " + type;
	}


}

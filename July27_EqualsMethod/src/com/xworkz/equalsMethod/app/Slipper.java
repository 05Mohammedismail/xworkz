package com.xworkz.equalsMethod.app;

public class Slipper {
	
	private String brand;
	private String model;
	private double size;
	private double price;
	private String color;
	private String shopName;
	private boolean sale;
	
	
public Slipper(String brand, String model, double size, double price, String color, String shopName, boolean sale) {
		this.brand = brand;
		this.model = model;
		this.size = size;
		this.price = price;
		this.color = color;
		this.shopName = shopName;
		this.sale = sale;
	}


	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public boolean isSale() {
		return sale;
	}
	public void setSale(boolean sale) {
		this.sale = sale;
	}


	@Override
	public String toString() {
		return "Slipper brand=" + brand +"\n"+ "model=" + model +"\n"+ "size=" + size +"\n"+ 
				"price=" + price +"\n"+ "color="+ color +"\n"+ "shopName=" + shopName +"\n"+ "sale=" + sale;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj!= null) 
		{
			System.out.println("Object not null checked");
			if(obj instanceof Slipper) 
			{
				System.out.println("Objects type is matched");
				Slipper casted = (Slipper)obj;
				if(this.brand == casted.brand && this.sale == casted.sale && this.color == casted.color &&
						this.model == casted.model && this.price == casted.price && this.shopName == casted.shopName
						&& this.size == casted.size) 
				{
					System.out.println("Both objects are same");
					return true;
				}
				else 
				{
					System.err.println("Both objects are not same");
				}
			}
			else 
			{
				System.err.println("Object type is not matched");
			}
			}
		else 
		{
			System.err.println("Object is Null cannot campare");
			}
		
		return false;
	}
	

}

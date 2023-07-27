package com.xworkz.equalsMethod.app;

public class Gold {
	
	private String shopName;
	private String brand;
	private double wieght;
	private double price;
	
	
	public Gold(String shopName, String brand, double wieght, double price) {
		this.shopName = shopName;
		this.brand = brand;
		this.wieght = wieght;
		this.price = price;
	}
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getWieght() {
		return wieght;
	}
	public void setWieght(double wieght) {
		this.wieght = wieght;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "shopName=" + shopName + "\n"+ "brand=" + brand + "\n"+ "wieght=" + wieght + "\n" + 
							"price=" + price;
	}
	
	
	@Override
	public boolean equals(Object obj) 
	{
		if(obj!= null) 
		{
			System.out.println("Object is Not null Checked :) ");
			if(obj instanceof Gold) 
			{
				System.out.println("Objects type is matched");
				Gold casted = (Gold)obj;
				if(this.brand == casted.brand && this.price == casted.price && 
						this.shopName == casted.shopName && this.wieght == casted.wieght) 
				{
					System.out.println("Both objects are Same");
					return true;
				}
				else 
				{
					System.err.println("Both objects are not Same");
				}
				
			}
			else 
			{
				System.err.println("Object type is not matched");
			}
			
		}
		else 
		{
			System.err.println("object is null cannot compare");
		}
		
		return false;
	}
	

}

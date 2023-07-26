package com.xworkz.encapsulation.app;

public class Helmet {
	
	private String brand;
	private double weight;
	private double offlinePrice;
	private double onlinePrice;
	private String color;
	
	public void setHelmet(String brand,  double weight, double offlinePrice, double onlinePrice, String color) 
	{
		this.brand = brand;
		this.weight = weight;
		this.offlinePrice = offlinePrice;
		this.onlinePrice = onlinePrice;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return " brandName = "+ brand +"\n"+ " helmetWeight in kg =  "+ weight +"\n"+ " offlinePrice in Rs =  "+ 
				offlinePrice +"\n"+ " onlinePricei in Rs =  "+ onlinePrice +"\n"+ " helmetColor = "+ color  ;
	}
	

}

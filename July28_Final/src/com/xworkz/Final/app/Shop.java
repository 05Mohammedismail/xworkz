package com.xworkz.Final.app;

public class Shop extends Street {
	
	private String shopName;
	private String shopType;
	
	public Shop(String streetName, String streetAddress, String shopName, String shopType) {
		super(streetName, streetAddress);
		this.shopName = shopName;
		this.shopType = shopType;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Shop Name :"+shopName);
		System.out.println("Shop Type :"+shopType);

	}
	

}

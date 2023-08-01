package com.xworkz.Final.app.multiLevel;

public class FoodShop extends Shop {
	
	private String foodShopType;
	private String ownerName;
	
	public FoodShop(String streetName, String streetAddress, String shopName, String shopType, String foodShopType,
			String ownerName) {
		super(streetName, streetAddress, shopName, shopType);
		this.foodShopType = foodShopType;
		this.ownerName = ownerName;
	}
	
	@Override
	public void printInfo(){
		super.printInfo();
		System.out.println("Food Type :"+foodShopType);
		System.out.println("Owner Name :"+ownerName);
		
	}
	
	

	
}

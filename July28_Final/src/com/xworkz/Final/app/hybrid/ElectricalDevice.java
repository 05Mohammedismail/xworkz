package com.xworkz.Final.app.hybrid;

public class ElectricalDevice extends Device {
	
	private String brandName;
	private double price;
	
	public ElectricalDevice(String deviceCategory, String deviceType, String brandName, double price) {
		super(deviceCategory, deviceType);
		this.brandName = brandName;
		this.price = price;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Brand Name :"+brandName);
		System.out.println("Device price :"+price);
	}	
}

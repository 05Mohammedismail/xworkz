package com.xworkz.Final.app;

public class ElectronicDevice extends Device{

	private String brandName;
	private double price;
	private boolean isPortable;
	
	
	public ElectronicDevice(String deviceCategory, String deviceType, String brandName, double price,
			boolean isPortable) {
		super(deviceCategory, deviceType);
		this.brandName = brandName;
		this.price = price;
		this.isPortable = isPortable;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Brand Name :"+brandName);
		System.out.println("Device price :"+price);
		System.out.println("Device is Portable :"+isPortable);
	}

}

package com.xworkz.Final.app;

public class Mobile extends ElectronicDevice{
	
	private String mobileOwnerName;

	public Mobile(String deviceCategory, String deviceType, String brandName, double price, boolean isPortable,
			String mobileOwnerName) {
		super(deviceCategory, deviceType, brandName, price, isPortable);
		this.mobileOwnerName = mobileOwnerName;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Device Owner Name :"+mobileOwnerName);
		
	}

}

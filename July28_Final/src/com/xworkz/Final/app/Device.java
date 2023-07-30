package com.xworkz.Final.app;

public class Device {
	
	private String deviceType;
	private String deviceCategory;
	
	
	public Device(String deviceCategory, String deviceType) {
		super();
		this.deviceType = deviceType;
		this.deviceCategory = deviceCategory;
	}
	
	public void printInfo() {
		System.out.println("Device Category :"+deviceCategory);
		System.out.println("Device Type :"+deviceType);
	}

}

package com.xworkz.Final.app.multiLevel;

public class Street {
	
	private String streetName;
	private String streetAddress;
	
	public Street(String streetName, String streetAddress) {
		this.streetName = streetName;
		this.streetAddress = streetAddress;
	}

	public void printInfo() {
		System.out.println("StreetArea Name :"+streetName);
		System.out.println("Street Address :"+streetAddress);
	}
	
}

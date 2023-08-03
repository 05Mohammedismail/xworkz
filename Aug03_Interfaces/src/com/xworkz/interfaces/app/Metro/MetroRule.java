package com.xworkz.interfaces.app.Metro;

public interface MetroRule {
	
	String METRO_STATION_NAME = "Dasarahalli";
	
	public static void getStation() {
		System.out.println("Metro Station Name is :"+METRO_STATION_NAME);
	}
	
	void getTicket();
	
	void getPlatform();

}

package com.xworkz.encapsulation.app;

public class Dosa {
	
	private String type;
	private double price;
	private boolean withPalya;
	private String hotelName;
	private boolean takeAway;
	
	//getters
	public String getHotelName() {
		return hotelName;
	}
	public double getPrice() {
		return price;
	}
	public String getType() {
		return type;
	}
	public boolean getWithPalya() {
		return withPalya;
	}
	public boolean getTakeAwat() {
		return takeAway;
	}
	
	//setters
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setTakeAway(boolean takeAway) {
		this.takeAway = takeAway;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setWithPalya(boolean withPalya) {
		this.withPalya = withPalya;
	}
	 
	//toString method
	public String toString() {
		return " hotelName = "+ hotelName +"\n"+ " dosaPrice =  "+ price +"\n"+ " dosaWithPalya =  "+ 
						withPalya +"\n"+ " dosaType =  "+ type +"\n"+ " takeAway = "+ takeAway  ;
	}
	
}


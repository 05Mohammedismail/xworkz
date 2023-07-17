package com.xworkz.isA;

public class City {
	
	String cityName;
    double sqkm;
    String cityFamousFor;
    
    public static void main(String[] args) {
    	
    	Bengaluru bengaluru = new Bengaluru("Banglore", 741 , "IT Tech parks" , 5 , true , "chilled" );
    	bengaluru.printInfo();
    }
	
    
    public City(String cityName, double sqkm, String cityFamousFor) {
    	System.out.println("Running string, double, string constructor in City (super class)");
		this.cityName = cityName;
		this.sqkm = sqkm;
		this.cityFamousFor = cityFamousFor;
	}

}

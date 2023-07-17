package com.xworkz.isA;

public class Home extends Building{
	
	String name;
	String landLordName;
	int landLordAge;
	
	public Home(String name, String landLordName, int landLordAge, String cementBrand, double height, double expenditure, String color) {
        super(cementBrand , height , color , expenditure);
		this.name = name;
		this.landLordName = landLordName;
		this.landLordAge = landLordAge;
		 System.out.println("Running string , string, int, string, double, double, string constructor in Building (Super class)");

	}
	void printInfo() {
		System.out.println("Running print Info in Home (child class)");
		System.out.println("Cement Brand name : " + cementBrand);
		System.out.println("Building height in mtrs : " + height);
		System.out.println("Building Color : " + color);
		System.out.println("Building  expenditure in lakhs: " + expenditure);
		System.out.println("Home name : " + name);
		System.out.println("Home land lord name : " + landLordName);
		System.out.println("Home land lord age : " + landLordAge);


	}
	
	

}

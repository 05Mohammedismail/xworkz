package com.xworkz.isA;

public class Building {

	String cementBrand;
	double height;
	String color;
	double expenditure;
	
	public static void main(String[] args) {
		
		Home home1 = new Home("Manoj residency", "Manoj", 21, "JK Super", 56 , 50, "Grey");
		home1.printInfo();
		
		System.out.println("* * * * * * * * * * * * * * * * *");

		Home home2 = new Home("Suraj residency", "Suraj", 23, "Ambuja", 80 , 85, "White");
		home2.printInfo();
	}
	
	
	public Building(String cementBrand, double height, String color, double expenditure) {
		System.out.println("Running string , double , string , double constructor in Building (Super class)");
		this.cementBrand = cementBrand;
		this.height = height;
		this.color = color;
		this.expenditure = expenditure;
	}
	
	
	
	
	
}

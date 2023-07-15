package com.xworkz.association;

public class Franchise {
	
	String name;
	String establishedIn = "2008";
	String ownerName;
	
	Franchise(String name , String ownerName){
		this.name = name;
		this.ownerName = ownerName;
	}
	
	void printInfo() {
		System.out.println("Running print Info in Franchise");
		System.out.println("Franchise Name  : " + name);
		System.out.println("Franchise established in :" + establishedIn);
		System.out.println("Franchise Owner name  : " + ownerName);
	}
}

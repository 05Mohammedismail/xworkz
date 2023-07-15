package com.xworkz.association;

public class Hotel {
	
	String name;
	String foundedIn;
	String address;
	String type = "Non-Veg";
	
	Owner own1 = new Owner("Manoj" ,21 , "Not defined");
	Owner own2 = new Owner("Suraj" , 23 , "male");
	

	public static void main(String[] args) {
		
		Hotel ref1 = new Hotel("Healthy Meals" , "2004");
		Hotel ref2 = new Hotel("Halli Mane" , "2007");
		
		ref1.setAddress("Chitradurga");
		ref2.setAddress("Banglore");
		
		ref1.printInfo();
		System.out.println("");
		ref1.own1.printInfo();
		System.out.println(" * * * * * * * * * * * * * * *");
		ref2.printInfo();
		System.out.println("");
		ref2.own2.printInfo();
 
	}
		Hotel(String name ,  String foundedIn){
			this.name = name ;
			this.foundedIn = foundedIn;
		}
		
		void setAddress(String address) {
			this.address = address;
		}
		
		void printInfo() {
			System.out.println("Running print Info in Hotel");
			System.out.println("Hotel Name : " + name);
			System.out.println("Hotel founded in : " + foundedIn);
			System.out.println("Hotel address : " + address);
			System.out.println("Hotel type : " + type);
		}
}

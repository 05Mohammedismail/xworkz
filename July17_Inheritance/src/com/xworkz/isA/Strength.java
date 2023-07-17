package com.xworkz.isA;

public class Strength {
	
	boolean confidence;
	boolean reputation;
	
	public static void main(String[] args) {
		
		Money money1 = new Money(true , true , "Rupee" , "Note" , 500);
		money1.printInfo();
		
		System.out.println("* * * * * * * * * * * * * * * * *");
		
		Money money2 = new Money(true, true, "Dollor", "Coin", 20);
		money2.confidence = false;
		money2.printInfo();
		
	}
	
	public Strength(boolean confidence, boolean reputation) {
		System.out.println("Running boolean , boolean constructor of Strength (Super class)");
		this.confidence = confidence;
		this.reputation = reputation;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	

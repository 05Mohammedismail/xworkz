package com;

public class Coastal {
	
	static boolean coastal;
	String coastName;
	
	public static void main(String[] args) {
		
		 Coastal ref1 = new Coastal();
		 Coastal ref2 = new Coastal();
		 
		 ref1.coastName = "Gulf coast";
		 ref2.coastName = "West coast";
		 
		 ref1.getcoastName();
		 System.out.println("");
		 ref2.getcoastName();
		
	}
    
	
	static {
		Coastal.coastal = true;
	}
	
	static void getCoastal() {
		System.out.println("The place is Coastal :" + Coastal.coastal);
	}
	
	void getcoastName() {
		System.out.println("Running instance method in Coastal");
		getCoastal();
		System.out.println("The coast name is :" + this.coastName);
		
	}
}

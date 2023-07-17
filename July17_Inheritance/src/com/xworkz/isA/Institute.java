package com.xworkz.isA;

public class Institute {
	
	String name;
	String purpose;
	String teachingMode;
	String establishedIn;
	
	public static void main(String[] args) {
		
	   Xworkz x1 = new Xworkz("Xworkz", "Training", "offline", "2018", "Omkar", "BTM", 45);
	   x1.printInfo();
		
	   System.out.println("* * * * * * * * * * * * * * * * *");

	   Xworkz x2 = new Xworkz("Xworkz", "Training", "offline", "2018", "Omkar", "RajajiNagar", 70);
	   x2.printInfo();
		
	}
	
	public Institute(String name, String purpose, String teachingMode, String establishedIn) {
		System.out.println("Running string, string, string, string constructor in Institute (Parent Class)");
		this.name = name;
		this.purpose = purpose;
		this.teachingMode = teachingMode;
		this.establishedIn = establishedIn;
	}

}

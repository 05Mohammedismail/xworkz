package com.xworkz.Final.app;

public class Daughter extends Parent {
	private String DaughterName;
	private int DaughterAge;
	
	public Daughter(String name, long number, String DaughterName, int DaughterAge) {
		super(name, number);
		this.DaughterName = DaughterName;
		this.DaughterAge = DaughterAge;
	}

	@Override
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Daughter name :"+DaughterName);
		System.out.println("Daughter age :"+DaughterAge);
		
	}
	
	
	
}

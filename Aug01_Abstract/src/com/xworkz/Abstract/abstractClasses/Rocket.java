package com.xworkz.Abstract.abstractClasses;

public abstract class Rocket {
	
	public abstract void getName();
	
	public void getBudget(){
		System.out.println("The budget is 520cr");
	}

	public final void getCountry() {
		System.out.println("Country is INDIA");
		
	}
}
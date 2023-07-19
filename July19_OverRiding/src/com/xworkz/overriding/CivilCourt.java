package com.xworkz.overriding;

public class CivilCourt extends HighCourt {

	void propertyCase() {
		System.out.println("Property Case in Civil Court");
	}
	
	void theftCase() {
		System.out.println("Theft Case in Civil Court");
	}
	
	@Override
	void criminalCase() {
		System.out.println("Criminal Case in Civil Court");
	}

	@Override
	void forgeryCase() {
		System.out.println("Forgery Case in Civil Court");
	}

	
}

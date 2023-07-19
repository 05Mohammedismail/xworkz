package com.xworkz.overriding;

public class HighCourt extends SupremeCourt {
	
	void criminalCase() {
		System.out.println("Criminal Case in High Court");
	}
	
	void forgeryCase() {
		System.out.println("Forgery Case in High Court");
	}

	@Override
	void importantCase() {
		System.out.println("Important Case in High Court");
	}
}

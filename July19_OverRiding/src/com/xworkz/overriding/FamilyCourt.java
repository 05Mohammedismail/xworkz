package com.xworkz.overriding;

public class FamilyCourt extends CivilCourt {
		
	void divorce() {
		System.out.println("Divorce in FamilyCourt");
	}

	@Override
	void propertyCase() {
		System.out.println("Theft Case in Family Court");	
	}

	@Override
	void theftCase() {
		System.out.println("Theft Case in Family Court");	
		}
	
}


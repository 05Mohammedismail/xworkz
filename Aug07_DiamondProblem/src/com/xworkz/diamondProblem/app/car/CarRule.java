package com.xworkz.diamondProblem.app.car;

public interface CarRule {

	void buy();
	
	default void drive() {
		System.out.println("Default Car driving in Car Rule... ");
	}
}

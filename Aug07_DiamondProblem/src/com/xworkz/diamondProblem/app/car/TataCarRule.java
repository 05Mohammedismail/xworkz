package com.xworkz.diamondProblem.app.car;

public interface TataCarRule extends CarRule {
	
	void getService();
	
	 @Override
		default void drive() {
			System.out.println("Default Car driving in Tata Car Rule... ");
		}
		
	
	
}

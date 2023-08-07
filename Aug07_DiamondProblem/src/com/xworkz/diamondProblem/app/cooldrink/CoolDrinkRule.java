package com.xworkz.diamondProblem.app.cooldrink;

public interface CoolDrinkRule {
	
	void getCool();
	
	default void buyDrink() {
		System.out.println("Buying Cool drink in Cool Drink");
	}
	
	

}

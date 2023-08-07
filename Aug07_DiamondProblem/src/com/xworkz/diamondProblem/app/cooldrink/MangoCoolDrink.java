package com.xworkz.diamondProblem.app.cooldrink;

public interface MangoCoolDrink extends CoolDrinkRule {
	
	void getCrushed();
	
	@Override
	default void buyDrink() {
		System.out.println("Buying Cool drink in Mango Cool Drink ");
	}

}

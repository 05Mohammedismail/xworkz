package com.xworkz.diamondProblem.app.cooldrink;

public interface AppleCoolDrink extends CoolDrinkRule {
	
	void getApple();
	
	@Override
	default void buyDrink() {
		System.out.println("Buying Cool Drink in Apple Cool Drink");
	}

}

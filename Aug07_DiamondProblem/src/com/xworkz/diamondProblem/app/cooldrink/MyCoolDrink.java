package com.xworkz.diamondProblem.app.cooldrink;

public class MyCoolDrink implements MangoCoolDrink, AppleCoolDrink {

	@Override
	public void getCool() {
		System.out.println("Get Cool in My Cool Drink");
	}

	@Override
	public void getApple() {
		System.out.println("Get Apple in My Cool Drink");
		
	}

	@Override
	public void getCrushed() {
		System.out.println("Get Crushed fruit in My Cool Drink");
	}

	@Override
	public void buyDrink() {
		System.out.println("Buying Cool Drink in My Cool Drink");
		AppleCoolDrink.super.buyDrink();
		MangoCoolDrink.super.buyDrink();
	}
	

}

package com.xworkz.diamondProblem.runner;

import com.xworkz.diamondProblem.app.cooldrink.AppleCoolDrink;
import com.xworkz.diamondProblem.app.cooldrink.CoolDrinkRule;
import com.xworkz.diamondProblem.app.cooldrink.MangoCoolDrink;
import com.xworkz.diamondProblem.app.cooldrink.MyCoolDrink;

public class CoolDrinkRuleRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Cool Drink Rule Runner\n");
		
		CoolDrinkRule drink1 = new MyCoolDrink();
		drink1.buyDrink();
		drink1.getCool();
		
		System.out.println(" ");
		
		MangoCoolDrink mango = new MyCoolDrink();
		mango.buyDrink();
		mango.getCool();
		mango.getCrushed();
		
		System.out.println(" ");
		
		AppleCoolDrink apple = new MyCoolDrink();
		apple.buyDrink();
		apple.getApple();
		apple.getCool();
		
		System.out.println(" ");
		
		MyCoolDrink myDrink = new MyCoolDrink();
		myDrink.buyDrink();
		myDrink.getApple();
		myDrink.getCool();
		myDrink.getCrushed();
		
		
	}

}

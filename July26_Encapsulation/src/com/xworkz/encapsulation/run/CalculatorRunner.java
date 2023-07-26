package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Calculator;

public class CalculatorRunner {

	public static void main(String[] args) {

		System.out.println("Running main in Calculator Runner");
		
		Calculator calculator = new Calculator();
		
		System.out.println(calculator);
		calculator.setCalculator("Casio", 1000, "cs-97", "Scientific", "silver");
		
		System.out.println("* * * * * * * * * * * * * * * * * *");
		
		System.out.println(calculator);
	}

}

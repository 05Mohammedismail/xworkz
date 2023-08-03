package com.xworkz.interfaces.app.Saloon;

public class DesiSaloonRule implements SaloonRule {

	@Override
	public void waitForYourTurn() {
		System.out.println("Wait for your turn to get Hair cut");
	}

	@Override
	public void dontMove() {
		System.out.println("Dont move while getting hair cut");
	}

}

package com.xworkz.interfaces.app.Home;

public class MyHomeRule implements HomeRule {

	@Override
	public void getHomeBefore() {
		System.out.println("Should be home before 9pm");
	}

	@Override
	public void dontUseBadWords() {
		System.out.println("Should Avoid Using Bad Words");
	}
	
	

}

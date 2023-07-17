package com.xworkz.isA;

public class Money extends Strength{
	
	String currency;
	String type;
	int denomination;
	
	public Money(boolean confidence, boolean reputation, String currency, String type, int denomination) {
		super(confidence, reputation);
		this.currency = currency;
		this.type = type;
		this.denomination = denomination;
		System.out.println("Running boolean ,boolean , string , string , int constructor in Money");

	}
	
	void printInfo() {
		System.out.println("Running print Info in Money (child class)");
		System.out.println("Confidence : " + confidence);
		System.out.println("reputation : " + reputation);
		System.out.println("Money currency : " + currency);
		System.out.println("Money type : " + type);
		System.out.println("Money denomination : " + denomination);

	}

	
}

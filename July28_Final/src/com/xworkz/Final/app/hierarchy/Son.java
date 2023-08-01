package com.xworkz.Final.app.hierarchy;

public class Son extends Parent {
	private String sonName;
	private int sonAge;
	
	public Son(String name, long number, String sonName, int sonAge) {
		super(name, number);
		this.sonName = sonName;
		this.sonAge = sonAge;
	}

	@Override
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Son name :"+sonName);
		System.out.println("Son age :"+sonAge);
		
	}
	
}

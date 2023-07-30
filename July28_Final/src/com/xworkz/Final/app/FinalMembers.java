package com.xworkz.Final.app;

public final class FinalMembers {
	
	private final String humanName;
	private final int humanAge;
	private final String humanGender;
	
	
	public FinalMembers(String humanName, int humanAge, String humanGender) {
		this.humanName = humanName;
		this.humanAge = humanAge;
		this.humanGender = humanGender;
	}
	
	public final void show() {
		System.out.println("Human Name :"+humanName);
		System.out.println("Human Age :"+humanAge);
		System.out.println("Human Gender :"+humanGender);
		
	}
	
	
	

}

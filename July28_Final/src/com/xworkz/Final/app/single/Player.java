package com.xworkz.Final.app.single;

public class Player extends Coacher{
	
	private String playerName;
	private String gender;
	
	public Player(String name, int age, String playerName, String gender) {
		super(name, age);
		this.playerName = playerName;
		this.gender = gender;
		
		
	}

	public String getStudentName() {
		return playerName;
	}
	public String getGender() {
		return gender;
	}

	
	public void setStudentName(String studentName) {
		this.playerName = studentName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("player name :"+playerName);
		System.out.println("player gender :"+gender);
		
	}
	
	
	}



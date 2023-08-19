package com.xworkz.app.dto;

import java.io.Serializable;

public class PilotDTO implements Serializable{
	
	private String name;
	private String gender;
	private int age;
	private int pilotId;
	private boolean married;
	
	public PilotDTO() {
	}

	public PilotDTO(String name, String gender, int age, int pilotId, boolean married) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.pilotId = pilotId;
		this.married = married;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public int getPilotId() {
		return pilotId;
	}

	public boolean isMarried() {
		return married;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPilotId(int pilotId) {
		this.pilotId = pilotId;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "name=" + name + ", gender=" + gender + ", age=" + age + ", pilotId=" + pilotId + ", married=" + married;
	}

	
}

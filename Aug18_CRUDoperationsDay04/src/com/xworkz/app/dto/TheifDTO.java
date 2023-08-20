package com.xworkz.app.dto;

import java.io.Serializable;

public class TheifDTO implements Serializable {

	private String specializedIn;
	private double experience;
	private double age;
	private String gangName;
	private int totalCases;
	
	public TheifDTO() {
	}

	public TheifDTO(String specializedIn, double experience, double age, String gangName, int totalCases) {
		this.specializedIn = specializedIn;
		this.experience = experience;
		this.age = age;
		this.gangName = gangName;
		this.totalCases = totalCases;
	}

	public String getSpecializedIn() {
		return specializedIn;
	}

	public double getExperience() {
		return experience;
	}

	public double getAge() {
		return age;
	}

	public String getGangName() {
		return gangName;
	}

	public int getTotalCases() {
		return totalCases;
	}

	public void setSpecializedIn(String specializedIn) {
		this.specializedIn = specializedIn;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public void setGangName(String gangName) {
		this.gangName = gangName;
	}

	public void setTotalCases(int totalCases) {
		this.totalCases = totalCases;
	}

	@Override
	public String toString() {
		return "specializedIn=" + specializedIn + ", experience=" + experience + ", age=" + age + ", gangName="
				+ gangName + ", totalCases=" + totalCases;
	}

}

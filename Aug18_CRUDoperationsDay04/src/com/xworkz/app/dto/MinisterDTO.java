package com.xworkz.app.dto;

import java.io.Serializable;

public class MinisterDTO  implements Serializable {
	
	private String name;
	private double experience;
	private String designation;
	private String partyName;
	
	public MinisterDTO() {

	} 
	
	public MinisterDTO(String name, double experience, String designation, String partyName) {
		this.name = name;
		this.experience = experience;
		this.designation = designation;
		this.partyName = partyName;
	}

	public String getName() {
		return name;
	}

	public double getExperience() {
		return experience;
	}

	public String getDesignation() {
		return designation;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	@Override
	public String toString() {
		return "name=" + name + ", experience=" + experience + ", designation=" + designation + ", partyName="
				+ partyName;
	}
	
	
	

}

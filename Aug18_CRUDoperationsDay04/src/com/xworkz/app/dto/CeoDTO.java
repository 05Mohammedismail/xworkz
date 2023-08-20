package com.xworkz.app.dto;

import java.io.Serializable;

public class CeoDTO implements Serializable {
	
	private String name;
	private String companyName;
	private double salary;
	private double experience;
	
	
	public CeoDTO() {
		
	}
	
	public CeoDTO(String name, String companyName, double salary, double experience) {
		this.name = name;
		this.companyName = companyName;
		this.salary = salary;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public double getSalary() {
		return salary;
	}

	public double getExperience() {
		return experience;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "name=" + name + ", companyName=" + companyName + ", salary=" + salary + ", experience=" + experience;
	}

	
	
}

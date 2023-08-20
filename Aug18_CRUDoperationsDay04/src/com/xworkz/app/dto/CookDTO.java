package com.xworkz.app.dto;

import java.io.Serializable;

public class CookDTO  implements Serializable{
	
	private String specialItem;
	private String hotelName;
	private String gender;
	private double salary;
	
	public CookDTO() {
		
	}

	public CookDTO(String specialItem, String hotelName, String gender, double salary) {
		this.specialItem = specialItem;
		this.hotelName = hotelName;
		this.gender = gender;
		this.salary = salary;
	}

	public String getSpecialItem() {
		return specialItem;
	}

	public String getHotelName() {
		return hotelName;
	}

	public String getGender() {
		return gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSpecialItem(String specialItem) {
		this.specialItem = specialItem;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "specialItem=" + specialItem + ", hotelName=" + hotelName + ", gender=" + gender + ", salary=" + salary;
	}
	
	

	
}

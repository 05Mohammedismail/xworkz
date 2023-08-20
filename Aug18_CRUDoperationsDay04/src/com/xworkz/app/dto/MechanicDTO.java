package com.xworkz.app.dto;

import java.io.Serializable;

public class MechanicDTO implements Serializable {
	
	private String garageName;
	private int gstNumber;
	private double bikeServiceCost;
	private String specialization;
	
	public MechanicDTO() {
	
	}
	
	public MechanicDTO(String garageName, int gstNumber, double bikeServiceCost, String specialization) {
		this.garageName = garageName;
		this.gstNumber = gstNumber;
		this.bikeServiceCost = bikeServiceCost;
		this.specialization = specialization;
	}
	public String getGarageName() {
		return garageName;
	}
	public int getGstNumber() {
		return gstNumber;
	}
	public double getBikeServiceCost() {
		return bikeServiceCost;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setGarageName(String garageName) {
		this.garageName = garageName;
	}
	public void setGstNumber(int gstNumber) {
		this.gstNumber = gstNumber;
	}
	public void setBikeServiceCost(double bikeServiceCost) {
		this.bikeServiceCost = bikeServiceCost;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "garageName=" + garageName + ", gstNumber=" + gstNumber + ", bikeServiceCost=" + bikeServiceCost
				+ ", specialization=" + specialization;
	}
	
	

}

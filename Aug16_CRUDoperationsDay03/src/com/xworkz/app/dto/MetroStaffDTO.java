package com.xworkz.dto.app;

import java.io.Serializable;

public class MetroStaffDTO implements Serializable {
	
	private String cityName;
	private String metroStationName;
	private int totalNoOfEmployees;
	private int workingHours;
	private boolean allStaffPresent;
	
	public MetroStaffDTO() {
	}

	public MetroStaffDTO(String cityName, String metroStationName, int totalNoOfEmployees, int workingHours,
			boolean allStaffPresent) {
		this.cityName = cityName;
		this.metroStationName = metroStationName;
		this.totalNoOfEmployees = totalNoOfEmployees;
		this.workingHours = workingHours;
		this.allStaffPresent = allStaffPresent;
	}

	public String getCityName() {
		return cityName;
	}

	public String getMetroStationName() {
		return metroStationName;
	}

	public int getTotalNoOfEmployees() {
		return totalNoOfEmployees;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public boolean isAllStaffPresent() {
		return allStaffPresent;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setMetroStationName(String metroStationName) {
		this.metroStationName = metroStationName;
	}

	public void setTotalNoOfEmployees(int totalNoOfEmployees) {
		this.totalNoOfEmployees = totalNoOfEmployees;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	public void setAllStaffPresent(boolean allStaffPresent) {
		this.allStaffPresent = allStaffPresent;
	}

	@Override
	public String toString() {
		return "cityName=" + cityName + ", metroStationName=" + metroStationName + ", totalNoOfEmployees="
				+ totalNoOfEmployees + ", workingHours=" + workingHours + ", allStaffPresent=" + allStaffPresent;
	}

	
	

}

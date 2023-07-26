package com.xworkz.encapsulation.app;

public class Satellite {
	
	private String name;
	private long budget;
	private String mission;
	private String launchPlace;
	private String launchDate;
	
	public void setBudget(long budget) 
	{
		this.budget = budget;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setLaunchDate(String launchDate) 
	{
		this.launchDate = launchDate;
	}
	public void setLaunchPlace(String launchPlace) 
	{
		this.launchPlace = launchPlace;
	}
	public void setMission(String purpose) {
		this.mission = purpose;
	}
	
	@Override
	public String toString() {
		
		return "Satellite Name is = " + name + "\n" + "Budget is Rs = " + budget + "\n" + "Launch Date is = " 
				+ launchDate + "\n" + "Launch Place is = " + launchPlace + "\n" + "Mission is = " + mission;
	}
	

}

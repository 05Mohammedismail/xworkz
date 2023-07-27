package com.xworkz.equalsMethod.app;

import java.util.Objects;

public class Vehicle {
	
	private String name;
	private String drivingType;
	private String companyName;
	private String modelName;
	private double price;
	
	public Vehicle(String name, String drivingType, String companyName, String modelName, double price) {
		super();
		this.name = name;
		this.drivingType = drivingType;
		this.companyName = companyName;
		this.modelName = modelName;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDrivingType() {
		return drivingType;
	}

	public void setDrivingType(String drivingType) {
		this.drivingType = drivingType;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "VehicleName=" + name + "\n"+ "drivingType=" + drivingType + "\n"+ "companyName=" + companyName
				+ "\n"+ "modelName=" + modelName + "\n"+ "priceInLakh=" + price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(companyName, drivingType, modelName, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!= null) {
			System.out.println("Object not null checked");
			if (obj instanceof Vehicle){
		      System.out.println("Objects type matched");
			  Vehicle casted = (Vehicle)obj;
				if(this.companyName == casted.companyName && this.drivingType == casted.drivingType &&
					this.modelName == casted.modelName && this.name == casted.name && this.price == casted.price) {
				System.out.println("Both Objects are same");
				return true;
			}
			else 
			{
				System.err.println("Both objects are not same");
			}
	
			}else{
				System.err.println("Objects type mis-matched");
				}
			}
		else {
			System.err.println("Object is null cant compare");
		}
		return false;
	}
	
}	
	
	
	
	
	

	
	



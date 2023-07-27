package com.xworkz.equalsMethod.app;

public class Grocery {
	
	private String name;
	private double price;
	
	public Grocery(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "GroceryName=" + name + "\n" + "price=" + price;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj!= null) {
			System.out.println("Object not null checked");
			if(obj instanceof Grocery) {
				System.out.println("Object type matched");
				Grocery casted = (Grocery)obj;
				if(this.name == casted.name && this.price == casted.price) {
					System.out.println("Both objects are same");
					return true;
				}
				else {
					System.err.println("Both objects are not same");
				}
			}
			else {
				System.err.println("Objects type mis-matched");
			}
		}
		else {
			
			System.err.println("Object is null cant compare");
			
		}
			return false;
	}
	
	
	
	
	

}

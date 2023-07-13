package com.xworkz;

public class Battery {
	String  name;
	String color;
	BatteryType type;
	double price;


	public static void main(String[] args) {
System.out.println("Running main in Battery");
		
		Battery ref1 = new Battery("Duracel" , "Gold");
		Battery ref2 = new Battery("EverReady" , "Red");
		
		ref1.setprice(15.2);
		ref2.setprice(11.3);
		
		ref1.display(BatteryType.Alkaline);
		System.out.println("");
		ref2.display(BatteryType.Lithium);

		
	}

	Battery(String name , String color){
		this.name = name;
		this.color = color;
		}
		
		void setprice(double price) {
			this.price = price;
			}
		
		void display(BatteryType type) {
			this.type = type;
			System.out.println("Battery name is : " + this.name);
			System.out.println("Battery color is : " + this.color);
			System.out.println("Battery type is : " + this.type);
			System.out.println("Battery price is : " + this.price);

			
		}
}			
		
		
		

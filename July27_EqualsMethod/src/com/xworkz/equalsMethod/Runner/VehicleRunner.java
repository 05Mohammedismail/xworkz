package com.xworkz.equalsMethod.Runner;
import com.xworkz.equalsMethod.app.Vehicle;

public class VehicleRunner {
	
		public static void main(String[] args) {
	System.out.println("Running main in Vehicle Runner\n");
	
	
	Vehicle vehicle1  = new Vehicle("Lorry", "manual", "Ashok layland ltd", "Ashak Layland Truck", 13.85);
	Vehicle vehicle2  = new Vehicle("Lorry", "manual", "Ashok layland ltd", "Ashak Layland Truck", 45.80);
	
	System.out.println("Object one:\n" + vehicle1 + "\n");
	System.out.println("* * * * * * * * * * * * * * * * *");
	System.out.println("Object two:\n" + vehicle2 + "\n");
	
	boolean result = vehicle1.equals(vehicle2);
		System.out.println("The Vehicles being same is : " + result);

		}
	
	}

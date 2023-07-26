package com.xworkz.encapsulation.run;
import com.xworkz.encapsulation.app.Satellite;

public class SatelliteRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Satellite Runner");
		
		Satellite satellite = new Satellite();
		
		System.out.println(satellite);
		satellite.setName("Chandrayan 3");
		satellite.setBudget(615000000l);
		satellite.setLaunchDate("July14");
		satellite.setLaunchPlace("Satish Dhawan Space Centre, Sriharikota");
		satellite.setMission("To land in the Moon's south polar region");
		
		System.out.println("* * * * * * * * * * * * * * * * *");
		System.out.println(satellite);
	}

}

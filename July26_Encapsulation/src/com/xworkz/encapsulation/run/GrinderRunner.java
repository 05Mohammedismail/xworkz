package com.xworkz.encapsulation.run;
import com.xworkz.encapsulation.app.Grinder;
public class GrinderRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Grinder Runner");
		
		Grinder grinder = new Grinder();
		System.out.println(grinder);
		
		grinder.setGrinder("Prestige", "DS-11", 2500, "Electric", "Red");
		System.out.println("* * * * * * * * * * * * * * * * * * *");
		System.out.println(grinder);
		
		
	}

}

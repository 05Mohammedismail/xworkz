package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.elevator.Elevator;
import com.xworkz.abstraction.app.elevator.MallElevator;
import com.xworkz.abstraction.app.elevator.Srihari;

public class ElevatorRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Elevator Runner\n");
		
		Elevator elevator = new MallElevator();
	
		
		Srihari srihari = new Srihari(elevator);
		srihari.getCarry();
	}

}

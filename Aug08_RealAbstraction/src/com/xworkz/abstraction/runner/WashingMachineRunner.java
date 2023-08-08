package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.washingMachine.Vinod;
import com.xworkz.abstraction.app.washingMachine.WashingMachine;
import com.xworkz.abstraction.app.washingMachine.WhirlpoolWashingMachine;

public class WashingMachineRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main in Washing machine runner\n");
		
		WashingMachine machine = new WhirlpoolWashingMachine();
		
		Vinod vinod = new Vinod(machine);
		vinod.getRinse();

	}
	
}

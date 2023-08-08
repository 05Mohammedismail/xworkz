package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.printingMachine.Bharath;
import com.xworkz.abstraction.app.printingMachine.CanonPrintingMachine;
import com.xworkz.abstraction.app.printingMachine.PrintingMachine;

public class PrintingMachineRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Printing machine runner\n");
		
		PrintingMachine machine = new CanonPrintingMachine();
		
		Bharath bharath = new Bharath(machine);
		bharath.getPrint();

	}

}

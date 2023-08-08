package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.laptop.Ismail;
import com.xworkz.abstraction.app.laptop.Laptop;
import com.xworkz.abstraction.app.laptop.LenovoLaptop;

public class LaptopRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Laptop Runner\n");
		
		Laptop laptop =  new LenovoLaptop();	
	
		Ismail ismail =  new Ismail(laptop);
		ismail.getDisplay();
	
	}

}

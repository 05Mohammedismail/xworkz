package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.kidney.HumanKidney;
import com.xworkz.abstraction.app.kidney.Kidney;
import com.xworkz.abstraction.app.kidney.Manoj;

public class KidneyRunner {

	public static void main(String[] args) {
		System.out.println("Runnin main in Kidney Runner\n");
		
		
		Kidney kid = new HumanKidney();
		
		Manoj manoj = new Manoj(kid);
		manoj.check();
		
	}

}

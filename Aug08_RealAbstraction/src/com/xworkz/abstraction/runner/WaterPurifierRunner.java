package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.waterPurifier.AuroWaterPurifier;
import com.xworkz.abstraction.app.waterPurifier.Usama;
import com.xworkz.abstraction.app.waterPurifier.WaterPurifier;

public class WaterPurifierRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Water Purifier Runner\n");
		
		WaterPurifier purifier = new AuroWaterPurifier();
		
		Usama usama = new Usama(purifier);
		usama.getPurify();

	}

}

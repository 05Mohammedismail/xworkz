package com.xworkz.Final.run;

import com.xworkz.Final.app.hybrid.ElectricalDevice;
import com.xworkz.Final.app.hybrid.Mobile;

public class HybridRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Hybrid Runner\n");
		
		Mobile mobile = new Mobile("Electronic", "Mobile", "Apple", 90000, true, "Pratheek Adiga");
		mobile.printInfo();
		System.out.println("");
		ElectricalDevice electricalDevice = new ElectricalDevice("Electrical", "Fan", "Usha", 4000);
		electricalDevice.printInfo();
	}

}

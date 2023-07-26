package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Dosa;

public class DosaRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Dosa Runner");

		
		Dosa dosa = new Dosa();
		
		System.out.println(dosa);
		
		dosa.setHotelName("Dosa point");
		dosa.setPrice(45);
		dosa.setTakeAway(true);
		dosa.setType("SetDosa");
		dosa.setWithPalya(true);
		
		System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
		
		System.out.println(dosa);
		
	}

}

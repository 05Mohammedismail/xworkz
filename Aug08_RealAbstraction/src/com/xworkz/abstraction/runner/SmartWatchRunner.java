package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.smartWatch.BoatSmartWatch;
import com.xworkz.abstraction.app.smartWatch.SmartWatch;
import com.xworkz.abstraction.app.smartWatch.Suraj;

public class SmartWatchRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Smart watch Runner\n");
		
		SmartWatch smartWatch = new BoatSmartWatch();
		
		Suraj suraj = new Suraj(smartWatch);
		suraj.getMusic();

	}

}

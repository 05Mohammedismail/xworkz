package com.xworkz.encapsulation.run;
import com.xworkz.encapsulation.app.Headset;
public class HeadSetRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Head Set Runner");
		
		Headset headset = new Headset();
		System.out.println(headset);
		headset.setHeadSet("One plus", "Oneplus Buds Bluetooth", 4999, "WireLess", "White");
		System.out.println("* * * * * * * * * * * * * * * * * *");
		System.out.println(headset);
	}

}

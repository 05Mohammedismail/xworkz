package com.xworkz.equalsMethod.Runner;
import com.xworkz.equalsMethod.app.Slipper;

public class SlipperRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Slipper Runner\n");
		
		Slipper slipper1 = new Slipper("Puma", "puma wave flips", 8, 999, "grey", "Manoj slippers", false);		
		Slipper slipper2 = new Slipper("Puma", "puma wave flips", 8, 999, "grey", "Manoj slippers", false);
		
		System.out.println("Object one:\n"+slipper1+"\n");
		System.out.println("* * * * * * * * * * * * * *\n");
		System.out.println("Object two:\n"+slipper2+"\n");
		
		boolean result = slipper1.equals(slipper2);
		System.out.println("Both the slippers being same is : " + result);
	}

}

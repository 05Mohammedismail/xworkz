package com.xworkz.Final.run;

import com.xworkz.Final.app.constrOverloading.Shirt;

public class ConstructorOverloadingRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Constructor Overloading Runner");
		
		Shirt shirt1 = new Shirt();
		System.out.println(shirt1);
		System.out.println("");
		
		Shirt shirt2 = new Shirt("Snitch", "Black", "Casual");
		System.out.println(shirt2);
		System.out.println("");
		
		Shirt shirt3 = new Shirt("Raymond", "LightBlue", "Formal", 1500, true, 'L');
		System.out.println(shirt3);
	}

}

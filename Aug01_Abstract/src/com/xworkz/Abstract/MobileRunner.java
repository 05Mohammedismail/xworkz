package com.xworkz.Abstract;

import com.xworkz.Abstract.abstractClasses.Mobile;
import com.xworkz.Abstract.implementations.Mobile.Apple;
import com.xworkz.Abstract.implementations.Mobile.Samsung;

public class MobileRunner {

	public static void main(String[] args) {      
		System.out.println("Running main in Mobile Runner\n");
		
		Mobile mobile1 = new Samsung();
		mobile1.getMobileName();
		mobile1.getModel();
		mobile1.getConnectivity();
		
		System.out.println("* * * * * * * * * * * * * * *");
		
		Mobile mobile2 = new Apple();
		mobile2.getMobileName();
		mobile2.getModel();
		mobile2.getConnectivity();
		
		
	}

}

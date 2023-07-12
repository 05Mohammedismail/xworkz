package com;

public class NumberPlate {
	
	static String number;
	String color;

	public static void main(String[] args) {
				System.out.println("Running main in NumberPlate");
				  
				NumberPlate ref1  = new NumberPlate();
				  NumberPlate ref2  = new NumberPlate();
				  
				  ref1.color ="white";
				  ref2.color = "yellow";
				  
				  ref1.getcolor();
				  System.out.println("");
				  ref2.getcolor();

				  
				

			}
			static {
				NumberPlate.number = "KA54J2628";
			}
			
				static void getnumber() {
					System.out.println("NumberPlate number is :" + NumberPlate.number);
					
				}
				
				 
				 void getcolor() {
					System.out.println("Running non static method in NumberPlate");
					getnumber();
					System.out.println("color of NumberPlate is : " + this.color);
					
				
				}


}

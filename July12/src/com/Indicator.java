package com;

public class Indicator {
	static String brand;
	String color;

	public static void main(String[] args) {
				System.out.println("Running main in Indicator");
				  
				Indicator ref1  = new Indicator();
				  Indicator ref2  = new Indicator();
				  
				  ref1.color ="orange";
				  ref2.color = "red";
				  
				  ref1.getcolor();
				  System.out.println("");
				  ref2.getcolor();

				  
				

			}
			static {
				Indicator.brand = "BAJAJ";
			}
			
				static void getbrand() {
					System.out.println("Indicator brand is :" + Indicator.brand);
					
				}
				
				 
				 void getcolor() {
					System.out.println("Running non static method in Indicator");
					getbrand();
					System.out.println("color of Indicator is : " + this.color);
					
				
				}

}

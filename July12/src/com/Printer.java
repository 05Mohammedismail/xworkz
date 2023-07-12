package com;

public class Printer {

	static String brand;
	String type;

	public static void main(String[] args) {
				System.out.println("Running main in Printer");
				  
				Printer ref1  = new Printer();
				  Printer ref2  = new Printer();
				  
				  ref1.type ="Black ink";
				  ref2.type = "Color ink";
				  
				  ref1.gettype();
				  System.out.println("");
				  ref2.gettype();

				  
				

			}
			static {
				Printer.brand = "Canon";
			}
			
				static void getbrand() {
					System.out.println("Printer brand is :" + Printer.brand);
					
				}
				
				 
				 void gettype() {
					System.out.println("Running non static method in Printer");
					getbrand();
					System.out.println("type of Printer is : " + this.type);
					
				
				}
}

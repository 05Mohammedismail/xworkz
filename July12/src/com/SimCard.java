package com;

public class SimCard {
	
	static String brand;
	long number;

	public static void main(String[] args) {
				System.out.println("Running main in SimCard");
				  
				SimCard ref1  = new SimCard();
				  SimCard ref2  = new SimCard();
				  
				  ref1.number = 8971658685l;
				  ref2.number = 9901204699l;
				  
				  ref1.getnumber();
				  System.out.println("");
				  ref2.getnumber();

				  
				

			}
			static {
				SimCard.brand = "Airtel";
			}
			
				static void getbrand() {
					System.out.println("SimCard brand is :" + SimCard.brand);
					
				}
				
				 
				 void getnumber() {
					System.out.println("Running non static method in SimCard");
					getbrand();
					System.out.println("SimCard number is : " + this.number);
					
				
				}

}

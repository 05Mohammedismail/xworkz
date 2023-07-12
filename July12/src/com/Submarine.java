package com;

public class Submarine {
	
	static String model;
	String submarinerName;

	public static void main(String[] args) {
				System.out.println("Running main in Submarine");
				  
				Submarine ref1  = new Submarine();
				  Submarine ref2  = new Submarine();
				  
				  ref1.submarinerName ="Manoj";
				  ref2.submarinerName = "Suraj";
				  
				  ref1.getsubmarinerName();
				  System.out.println("");
				  ref2.getsubmarinerName();

				  
				

			}
			static {
				Submarine.model = "Shang class (Type 093)(SSBN)";
			}
			
				static void getmodel() {
					System.out.println("Submarine model is :" + Submarine.model);
					
				}
				
				 
				 void getsubmarinerName() {
					System.out.println("Running non static method in Submarine");
					getmodel();
					System.out.println("submarinerName of Submarine is : " + this.submarinerName);
					
				
				}

}

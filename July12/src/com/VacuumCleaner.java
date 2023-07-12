package com;

public class VacuumCleaner {
	
	static String brand;
	String type;

	public static void main(String[] args) {
				System.out.println("Running main in VacuumCleaner");
				  
				VacuumCleaner ref1  = new VacuumCleaner();
				  VacuumCleaner ref2  = new VacuumCleaner();
				  
				  ref1.type = "Hand Held ";
				  ref2.type = "Robotic ";
				  
				  ref1.gettype();
				  System.out.println("");
				  ref2.gettype();

				  
				

			}
			static {
				VacuumCleaner.brand = "Hoover";
			}
			
				static void getbrand() {
					System.out.println("VacuumCleaner brand is :" + VacuumCleaner.brand);
					
				}
				
				 
				 void gettype() {
					System.out.println("Running non static method in Vacuum");
					getbrand();
					System.out.println("VacuumCleaner type is : " + this.type);
					
				
				}

}

package com;

public class Wire {
	
	static double length;
	String type;

	public static void main(String[] args) {
				System.out.println("Running main in Wire");
				  
				Wire ref1  = new Wire();
				  Wire ref2  = new Wire();
				  
				  ref1.type ="plastic";
				  ref2.type = "steel";
				  
				  ref1.gettype();
				  System.out.println("");
				  ref2.gettype();

				  
				

			}
			static {
				Wire.length = 4.5;
			}
			
				static void getlength() {
					System.out.println("Wire length is :" + Wire.length);
					
				}
				
				 
				 void gettype() {
					System.out.println("Running non static method in Wire");
					getlength();
					System.out.println("type of Wire is : " + this.type);
					
				}
		


}

package com;

public class Rope {
	
	static double length;
	String type;

	public static void main(String[] args) {
				System.out.println("Running main in Rope");
				  
				Rope ref1  = new Rope();
				  Rope ref2  = new Rope();
				  
				  ref1.type ="plastic";
				  ref2.type = "steel";
				  
				  ref1.gettype();
				  System.out.println("");
				  ref2.gettype();

				  
				

			}
			static {
				Rope.length = 6.5;
			}
			
				static void getlength() {
					System.out.println("Rope length is :" + Rope.length);
					
				}
				
				 
				 void gettype() {
					System.out.println("Running non static method in Rope");
					getlength();
					System.out.println("type of Rope is : " + this.type);
					
				}
		

	}



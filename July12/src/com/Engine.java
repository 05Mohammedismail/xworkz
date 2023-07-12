package com;

public class Engine {

	static String brand;
	String type;

	public static void main(String[] args) {
				System.out.println("Running main in Engine");
				  
				Engine ref1  = new Engine();
				  Engine ref2  = new Engine();
				  
				  ref1.type = "Diesel Engine";
				  ref2.type = "Petrol Engine ";
				  
				  ref1.gettype();
				  System.out.println("");
				  ref2.gettype();

				  
				

			}
			static {
				Engine.brand = "HONDA";
			}
			
				static void getbrand() {
					System.out.println("Engine brand is :" + Engine.brand);
					
				}
				
				 
				 void gettype() {
					System.out.println("Running non static method in Vacuum");
					getbrand();
					System.out.println("Engine type is : " + this.type);
					
				
				}

}

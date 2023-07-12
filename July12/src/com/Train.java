package com;

public class Train {
	
	static String name;
	String type;

	public static void main(String[] args) {
				System.out.println("Running main in Train");
				  
				Train ref1  = new Train();
				  Train ref2  = new Train();
				  
				  ref1.type ="local";
				  ref2.type = "Express";
				  
				  ref1.gettype();
				  System.out.println("");
				  ref2.gettype();

				  
				

			}
			static {
				Train.name = "SHATABDI";
			}
			
				static void getname() {
					System.out.println("Train name is :" + Train.name);
					
				}
				
				 
				 void gettype() {
					System.out.println("Running non static method in Train");
					getname();
					System.out.println("type of Train is : " + this.type);
					
				
				}

}

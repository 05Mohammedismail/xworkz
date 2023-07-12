package com;

public class ContactLens {
	static String brand;
	String usage;

	public static void main(String[] args) {
				System.out.println("Running main in ContactLens");
				  
				ContactLens ref1  = new ContactLens();
				  ContactLens ref2  = new ContactLens();
				  
				  ref1.usage = "Daily Everyday";
				  ref2.usage = "Ocassional while Reading ";
				  
				  ref1.getusage();
				  System.out.println("");
				  ref2.getusage();

				  
				

			}
			static {
				ContactLens.brand = "Air Optix";
			}
			
				static void getbrand() {
					System.out.println("ContactLens brand is :" + ContactLens.brand);
					
				}
				
				 
				 void getusage() {
					System.out.println("Running non static method in Vacuum");
					getbrand();
					System.out.println("ContactLens usage is : " + this.usage);
					
				
				}

}

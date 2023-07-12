package com;

public class Fabric {
	static String brand;
	String material;

	public static void main(String[] args) {
				System.out.println("Running main in Fabric");
				  
				Fabric ref1  = new Fabric();
				  Fabric ref2  = new Fabric();
				  
				  ref1.material = "cotton";
				  ref2.material = "Velvet";
				  
				  ref1.getmaterial();
				  System.out.println("");
				  ref2.getmaterial();

				  
				

			}
			static {
				Fabric.brand = "RayMond";
			}
			
				static void getbrand() {
					System.out.println("Fabric brand is :" + Fabric.brand);
					
				}
				
				 
				 void getmaterial() {
					System.out.println("Running non static method in Fabric");
					getbrand();
					System.out.println("Fabric material is : " + this.material);
					
				
				}

}

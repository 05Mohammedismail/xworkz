package com;

public class NailCutter {
	
	 static String material;
	 String brand;
	 
	 public static void main(String[] args) {
		 System.out.println("Running main in NailCutter");
		 NailCutter ref1 = new NailCutter();
		 NailCutter ref2 = new NailCutter();
		 
		 ref1.brand = "Ashok";
		 ref2.brand = "Pushpa";
		 
		 ref1.getBrand();
		 System.out.println("");
		 ref2.getBrand();
		 
	 }
     
	 static {
		 NailCutter.material = "Stain less Steel";
	 }
	 
	 static void getMaterial() {
		 System.out.println("The NailCutter material is : " + NailCutter.material);
	 }
	 
	 void getBrand() {
		 System.out.println("Running non static method in NailCutter :");
		 System.out.println("The NailCutter brand is :" + this.brand);
		 getMaterial();
	 }
}

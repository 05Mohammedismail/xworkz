package com;

public class MotherBoard {
	
	static String type;
	 String manufactured;
	 
	 public static void main(String[] args) {
		 System.out.println("Running main in MotherBoard");
		 MotherBoard ref1 = new MotherBoard();
		 MotherBoard ref2 = new MotherBoard();
		 
		 ref1.manufactured = "June2023";
		 ref2.manufactured = "Oct2023";
		 
		 ref1.getmanufactured();
		 System.out.println("");
		 ref2.getmanufactured();
		 
	 }
    
	 static {
		 MotherBoard.type = "Micro ATX";
	 }
	 
	 static void gettype() {
		 System.out.println("The MotherBoard type is : " + MotherBoard.type);
	 }
	 
	 void getmanufactured() {
		 System.out.println("Running non static method in MotherBoard :");
		 System.out.println("The MotherBoard manufactured is :" + this.manufactured);
		 gettype();
	 }

}

package com.xworkz;

public class Resort {
	 String  name;
	String ownerName;
	ResortRoomType roomType;
	boolean breakfast;

	public static void main(String[] args) {
		System.out.println("Running main in Resort");
		
		Resort ref1 = new Resort("Manoj" , "pushpa");
		Resort ref2 = new Resort("Suraj" , "radha");
		
		ref1.setBreakfast(false);
		ref2.setBreakfast(true);
		
		ref1.display(ResortRoomType.five_star);
		System.out.println("");
		ref2.display(ResortRoomType.seven_star);

		
	}

	Resort(String name , String ownerName){
		this.name = name;
		this.ownerName = ownerName;
		}
		
		boolean setBreakfast(boolean breakfast) {
			this.breakfast = breakfast;
			return true;
			}
		
		void display(ResortRoomType roomType) {
			this.roomType = roomType;
			System.out.println("Resort name is : " + this.name);
			System.out.println("Resort ownerName is : " + this.ownerName);
			System.out.println("BreakFast availability is : " + this.breakfast);
			System.out.println("The roomType is : " + this.roomType);
			
		}
}			
		
		
	


package com.Xworkz.manoj;

public class ShoeRunner {

	public static void main(String[] args) {

		Shoe shoe1 = new NikeShoe(50000, SizeType.ELEVEN , ColorType.BLUE , "Jhon Donahoe", "Michael Jordon");
		ShoeUtil.buy(shoe1);
		
		System.out.println("* * * * * * * * * * * * * * *");
		
		Shoe shoe2 = new PumaShoe(20000, SizeType.TEN, ColorType.BLACK, "Suraj", 1998);
		ShoeUtil.buy(shoe2);
	}

}

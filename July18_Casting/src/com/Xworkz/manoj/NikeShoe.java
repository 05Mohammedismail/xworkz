package com.Xworkz.manoj;

public class NikeShoe extends Shoe{
	
	String ceo;
	String brandAmbassador;
	
	public NikeShoe(long price, SizeType size, ColorType color, String ceo, String brandAmbassador) {
		super(price, size, color);
		this.ceo = ceo;
		this.brandAmbassador = brandAmbassador;
	}
	
	void printInfo() {
		System.out.println("Running printinfo in Nike Shoe (Child) ");
		System.out.println("Shoe price : " + price);
		System.out.println("Shoe Size : " + size);
		System.out.println("Shoe Color : " + color);
		System.out.println("Company Ceo : " + ceo);
		System.out.println("Company Brand Ambassador : " + brandAmbassador);

	}
	
	
	

}

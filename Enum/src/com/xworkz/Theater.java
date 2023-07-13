package com.xworkz;

public class Theater {
	String  name;
	String address;
	TheaterMovie movie;
	double price;


	public static void main(String[] args) {
System.out.println("Running main in Theater");
		
		Theater ref1 = new Theater("Arjun" , "somewhere on earth");
		Theater ref2 = new Theater("Bharath Cinemas" , "Shimoga city centre");
		
		ref1.setprice(225);
		ref2.setprice(308);
		
		ref1.display(TheaterMovie.Kantara);
		System.out.println("");
		ref2.display(TheaterMovie.KGF);

		
	}

	Theater(String name , String address){
		this.name = name;
		this.address = address;
		}
		
		void setprice(double price) {
			this.price = price;
			}
		
		void display(TheaterMovie movie) {
			this.movie = movie;
			System.out.println("Theater name is : " + this.name);
			System.out.println("Theater address is : " + this.address);
			System.out.println("Theater movie is : " + this.movie);
			System.out.println("Movie price is : " + this.price);

			
		}
}			
	



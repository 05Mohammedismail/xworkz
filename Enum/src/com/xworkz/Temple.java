package com.xworkz;

public class Temple {
	
		String  city;
		String address;
		TempleGod god;
		long noOfVisitors;


		public static void main(String[] args) {
	System.out.println("Running main in Temple");
			
			Temple ref1 = new Temple("ChitraDurga" , "mainroad");
			Temple ref2 = new Temple("Davangere" , "2ndroad");
			
			ref1.setnoOfVisitors(500);
			ref2.setnoOfVisitors(900);
			
			ref1.display(TempleGod.Anjaneya);
			System.out.println("");
			ref2.display(TempleGod.Vishnu);

			
		}

		Temple(String city , String address){
			this.city = city;
			this.address = address;
			}
			
			void setnoOfVisitors(long noOfVisitors) {
				this.noOfVisitors = noOfVisitors;
				}
			
			void display(TempleGod god) {
				this.god = god;
				System.out.println("Temple city is : " + this.city);
				System.out.println("Temple address is : " + this.address);
				System.out.println("Temple god is : " + this.god);
				System.out.println("Temple noOfVisitors is : " + this.noOfVisitors);

				
			}
	}			
			




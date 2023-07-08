class FireExtinguisherRunner{
	public static void main(String[] args){
						System.out.println(" ");
		System.out.println("Running main in FireExtinguisherRunner...");
		System.out.println(" ");
		
		System.out.println("calling 1st constructor from FireExtinguisherRunner...");
	FireExtinguisher ref1 = new FireExtinguisher("Amerex" , "Class A - Suitable for paper" , 
	                                             4500 , "Foam type" , 4);
	ref1.info();
			System.out.println(" ");

	
			
	    System.out.println("calling 2nd constructor from FireExtinguisherRunner...");
    FireExtinguisher ref2 = new FireExtinguisher("EZ Fire Spray" , "Class B - Suitable for flammable liquids", 
												 3500 , "Water type" , 3);
    ref2.info();
		System.out.println(" ");
	
	
	    System.out.println("calling 3rd constructor from FireExtinguisherRunner...");
    FireExtinguisher ref3 = new FireExtinguisher("First Alert" ,"Class C - Suitable for flammable gasses" , 
												2500 , "Co2 type" , 2);
	ref3.info();
			System.out.println(" ");

	}
}
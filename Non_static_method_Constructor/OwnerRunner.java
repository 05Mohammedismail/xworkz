class OwnerRunner{
	public static void main(String[] args){
						System.out.println(" ");
		System.out.println("Running main in OwnerRunner...");
		System.out.println(" ");
		
		System.out.println("calling 1st constructor from OwnerRunner...");
	Owner ref1 = new Owner("Ismail" , 99012046l, 22 , "male" , 359999.9);
	ref1.info();
			System.out.println(" ");

	
			
	    System.out.println("calling 2nd constructor from OwnerRunner...");
    Owner ref2 = new Owner("Manoj" , 65813110l, 23 , "male" , 229999.9);
	ref2.info();
		System.out.println(" ");
	
	
	    System.out.println("calling 3rd constructor from OwnerRunner...");
    Owner ref3 = new Owner("Manoj's Wife" , 94453323l , 26 , "female" , 119999.9);
	ref3.info();
			System.out.println(" ");

	}
}
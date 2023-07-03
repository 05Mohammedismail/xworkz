class SweetRunner{
	public static void main(String[] sweets){
		System.out.println("running main");
		Sweet ref1 = new Sweet(); 
			System.out.println("name :"+ ref1.name);
			System.out.println("price :"+ ref1.price);
			System.out.println( "quantity :"+ ref1.quantity);
		
		System.out.println(" ");
			
		Sweet ref2 = new Sweet("halwa"); 
			System.out.println("name :"+ ref2.name);
			System.out.println("price :"+ ref2.price);
			System.out.println( "quantity :"+ ref2.quantity);
		
		System.out.println(" ");	
		
		Sweet ref3 = new Sweet("halwa" , 40 , 33.1f); 
			System.out.println("name :"+ ref3.name);
			System.out.println("price :"+ ref3.price);
			System.out.println( "quantity :"+ ref3.quantity);
	}
}
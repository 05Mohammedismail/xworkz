class FishRunner{
	public static void main(String[] fishes){
		System.out.println("Running main...");
		
		Fish ref1 = new Fish();
				System.out.println("name : " +ref1.name);
				System.out.println("type : " +ref1.type);
				System.out.println("price : " +ref1.price);
				System.out.println("location : " +ref1.location);
						System.out.println("");

		Fish ref2 = new Fish("cat fish");
				System.out.println("name : " +ref2.name);
				System.out.println("type : " +ref2.type);
				System.out.println("price : " +ref2.price);
				System.out.println("location : " +ref2.location);
				System.out.println("");
						System.out.println("");

		Fish ref3 = new Fish("sword fish" , "ocean type" , 187.6 );
				System.out.println("name : " +ref3.name);
				System.out.println("type : " +ref3.type);
				System.out.println("price : " +ref3.price);
				System.out.println("location : " +ref3.location);
						System.out.println("");

		Fish ref4 = new Fish("golden fish" , "aquarium type" , 204.3 , "fish shop" );
				System.out.println("name : " +ref4.name);
				System.out.println("type : " +ref4.type);
				System.out.println("price : " +ref4.price);
				System.out.println("location : " +ref4.location);
	}
}

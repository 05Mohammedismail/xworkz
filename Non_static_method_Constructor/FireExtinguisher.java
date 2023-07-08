class FireExtinguisher{
	String brand;
	String use;
	int price;
	String type;
	double capacity;
	
	FireExtinguisher(String brand,String use,int price,String type,double capacity){
		System.out.println("Running string,String,int,string,double constructor in FireExtinguisher");
		this.brand = brand;
		this.use = use;
		this.price = price;
		this.type = type;
		this.capacity = capacity;
	}
	void info(){
		System.out.println("Running non static method in FireExtinguisher");
		System.out.println("FireExtinguisher brand : " + brand);
		System.out.println("FireExtinguisher use : " + use);
		System.out.println("FireExtinguisher price : " + price);
		System.out.println("FireExtinguisher type : " + type);
		System.out.println("FireExtinguisher capacity in Kg : " + capacity);
		
		

	}
	
	
}
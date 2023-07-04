class Fish{
	String name = "Shark" ;
	String type ;
	double price ;
	String location;
	
	Fish(){
		System.out.println("Constructor 1 is running with 0 parameters... :");
	}
	
	Fish(String name){
		System.out.println("Constructor 2 is running with String parameter... :");
		this.name = name;
	}
	
	Fish(String name ,String type,double price){
		System.out.println("Constructor 3 is running with string,string,double parameters... :");
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	Fish(String name ,String type,double price,String location){
		System.out.println("Constructor 4 is running with string,string,double,string parameters... :");
		this.name = name;
		this.type = type;
		this.price = price;
		this.location = location;
	}
}	
class Owner{
	String name;
	long phNumber;
	int age;
	String gender;
	double turnOver;
	
	Owner(String name,long phNumber,int age,String gender,double turnOver){
		System.out.println("Running string,long,int,string,double constructor in Owner");
		this.name = name;
		this.phNumber = phNumber;
		this.age = age;
		this.gender = gender;
		this.turnOver = turnOver;
	}
	void info(){
		System.out.println("Running non static method in Owner");
		System.out.println("Owner name : " + name);
		System.out.println("Owner phNumber : " + phNumber);
		System.out.println("Owner age : " + age);
		System.out.println("Owner gender : " + gender);
		System.out.println("Owner turnOver : " + turnOver);
		
		

	}
	
	
}
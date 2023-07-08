class Worker{
	String name;
	int idNumber;
	String workingHours;
	String gender;
	double salary;
	
	Worker(String name,int idNumber,String workingHours,String gender,double salary){
		System.out.println("Running string,int,string,string,double constructor in worker");
		this.name = name;
		this.idNumber = idNumber;
		this.workingHours = workingHours;
		this.gender = gender;
		this.salary = salary;
	}
	void info(){
		System.out.println("Running non static method in worker");
		System.out.println("Worker name : " + name);
		System.out.println("Worker idNumber : " + idNumber);
		System.out.println("Worker workingHours : " + workingHours);
		System.out.println("Worker gender : " + gender);
		System.out.println("Worker salary : " + salary);
		
		

	}
	
	
}
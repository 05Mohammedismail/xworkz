class WorkerRunner{
	public static void main(String[] args){
						System.out.println(" ");
		System.out.println("Running main in WorkerRunner...");
		System.out.println(" ");
		
		System.out.println("calling 1st constructor from WorkerRunner...");
	Worker ref1 = new Worker("Ramesh" , 9 , "8hours" , "male" , 15999.9);
	ref1.info();
			System.out.println(" ");

	
			
	    System.out.println("calling 2nd constructor from WorkerRunner...");
    Worker ref2 = new Worker("Suresh" , 10 , "10hours" , "male" , 17999.9);
	ref2.info();
		System.out.println(" ");
	
	
	    System.out.println("calling 3rd constructor from WorkerRunner...");
    Worker ref3 = new Worker("pushpa" , 12 , "6hours" , "female" , 9999.9);
	ref3.info();
			System.out.println(" ");

	}
}
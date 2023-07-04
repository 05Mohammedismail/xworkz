class Sweet{
	String name = "jamoon";
	int price;
	float quantity;
	
	Sweet(){
	System.out.println("running with no arguements :");
	
	}
	Sweet(String sName){
	    	System.out.println("running with string arguements :");
	        name = sName;
	}
	Sweet(String name , int sPrice , float quantity){
			System.out.println("running with string,int,float arguements :");
                this.name = name;
				price= sPrice;
				this.quantity= quantity;
	}
}
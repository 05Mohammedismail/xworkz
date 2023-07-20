class Presentation{
	
	int mobile(int num1 , int num2){
		int num = num1+num2;
			

		return num;
	}
	
	public static void main(String[] args){
		Presentation m = new Presentation();
		
		
		System.out.println(m.mobile(3,4));
		
		int n = m.mobile(1 , 2);
		System.out.println(n);

	}
}

package com.xworkz.repository.app.Olympic;

public class OlympicRepositoryImpl implements OlympicRepository{
	
	private int[] year = new int[TOTAL];
	private String[] names = new String[TOTAL];
	private int index = 0;

	@Override
	public void save(int year, String country) {
		if(index < TOTAL) {
			this.year[index] = year;
			this.names[index] = country;
			System.out.println("Olympic year and Country saving at index " + index + " is " + year + " and " + country);
			index = index + 1 ;
			System.out.println("Updated index is " + index);
		}
		else {
			System.err.println("Index limit exceeded");
		}
		
	}

	@Override
	public void display() {

		for(int start=0; start<TOTAL; start++) {
			System.out.println("Olympic at index " + start + " is " + "year:" +
								this.year[start] +" "+  "Country:" + this.names[start] );
		}
		
	}

}

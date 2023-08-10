package com.xworkz.repository.app.Army;

public class ArmyRepositoryImpl implements ArmyRepository{
	
	private String names[] = new String[TOTAL_VALUE];
	
	private int startIndex = 0;

	@Override
	public void save(String batchName) {
		if(startIndex < TOTAL_VALUE) {
			this.names[startIndex] = batchName ;
			System.out.println("Name saved at " + startIndex + " is " + batchName);
			startIndex = startIndex + 1;
			System.out.println("Updated index is " + startIndex);
		}
		else {
			System.err.println("Index limit exceeded, Cannot store more names");
		}
	}

	@Override
	public void display() {
		for(int index=0; index<TOTAL_VALUE; index++) {
			System.out.println("Name at Index " + index + " is " + names[index]);
			
		}
		
	}

}

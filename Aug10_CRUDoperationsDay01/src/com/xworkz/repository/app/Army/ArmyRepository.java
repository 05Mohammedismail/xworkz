package com.xworkz.repository.app.Army;

public interface ArmyRepository {

	int TOTAL_VALUE = 5;
	
	void save(String batchName);
	
	void display();
}

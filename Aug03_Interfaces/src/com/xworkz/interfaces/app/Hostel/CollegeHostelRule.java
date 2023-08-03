package com.xworkz.interfaces.app.Hostel;

public class CollegeHostelRule implements HostelRule{

	@Override
	public void getFee() {
		System.out.println("Hostel Fee should be payed before Due date");
	}

	@Override
	public void closingTime() {
		System.out.println("Students Should be inside before Hostel Closing Time");
	}

}

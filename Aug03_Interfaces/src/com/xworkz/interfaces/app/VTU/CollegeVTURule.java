package com.xworkz.interfaces.app.VTU;

public class CollegeVTURule implements VTURule {

	@Override
	public void getExamFee() {
		System.out.println("Exam fee Should be payed to attend EXAM");
	}

	@Override
	public void getPass() {
		System.out.println("Should get Pass in exam to get into next Semester");
	}

}

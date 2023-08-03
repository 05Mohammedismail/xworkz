package com.xworkz.interfaces.app.Hospital;

public class CityHospitalRule implements HospitalRule{

	@Override
	public void getMask() {
		System.out.println("Wear Mask Inside Hospital");
	}

	@Override
	public void getMedicine() {
		System.out.println("Get Medicine After Treatment");
	}

}

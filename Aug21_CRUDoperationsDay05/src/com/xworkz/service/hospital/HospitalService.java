package com.xworkz.service.hospital;

import com.xworkz.dto.hospital.HospitalDTO;

public interface HospitalService {
	
	public boolean validate(HospitalDTO dto);
	
	public HospitalDTO findByHospitalName(String name);
	
	public HospitalDTO findByNameAndNoOfDoctors(String name, int numOfDoc);

}

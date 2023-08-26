package com.xworkz.repository.hospital;

import com.xworkz.dto.hospital.HospitalDTO;

public interface HospitalRepository  {
	
	int TOTAL_COUNT=5;
	
	public void save(HospitalDTO dto);

}

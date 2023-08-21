package com.workz.repository.hospital;

import com.workz.dto.hospital.HospitalDTO;

public interface HospitalRepository {
	
	int TOTAL_COUNT=5;
	
	public void save(HospitalDTO dto);

}

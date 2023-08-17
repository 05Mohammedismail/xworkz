package com.xworkz.dto.app.repository.metroStaff;

import com.xworkz.dto.app.MetroStaffDTO;

public interface MetroStaffRepository {

	int TOTAL_COUNT = 5;
	
	void save(MetroStaffDTO dto);
}

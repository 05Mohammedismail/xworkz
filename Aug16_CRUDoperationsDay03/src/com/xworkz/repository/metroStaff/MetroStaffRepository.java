package com.xworkz.repository.metroStaff;

import com.xworkz.app.dto.MetroStaffDTO;

public interface MetroStaffRepository {

	int TOTAL_COUNT = 5;
	
	public void save(MetroStaffDTO dto);
	
	public MetroStaffDTO findByMetroStationName(String name);
	
	public MetroStaffDTO findByNumberOfEmployees(int num);
	
	public MetroStaffDTO[] readAll();
 }

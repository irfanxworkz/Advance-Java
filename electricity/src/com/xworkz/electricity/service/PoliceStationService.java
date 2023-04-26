package com.xworkz.electricity.service;

import com.xworkz.electricity.dto.PoliceStationDTO;

public interface PoliceStationService {

	Boolean validateAndThenSave(PoliceStationDTO dto);
}

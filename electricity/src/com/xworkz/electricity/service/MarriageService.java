package com.xworkz.electricity.service;

import com.xworkz.electricity.dto.MarriageDTO;

public interface MarriageService {

	boolean validateAndThenSave(MarriageDTO dto);

}

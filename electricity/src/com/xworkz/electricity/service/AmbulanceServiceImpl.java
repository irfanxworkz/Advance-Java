package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.AmbulanceDTO;
import com.xworkz.electricity.dto.MarriageDTO;
import com.xworkz.electricity.repository.AmbulanceRepository;
import com.xworkz.electricity.util.ValidationUtil;

public class AmbulanceServiceImpl implements AmbulanceService {
	
	private ValidationUtil<AmbulanceDTO> validate =new ValidationUtil<>(); 
	
	private AmbulanceRepository ambulanceRepository;

	public AmbulanceServiceImpl(AmbulanceRepository ambulanceRepository) {
		this.ambulanceRepository = ambulanceRepository;
	}

	@Override
	public boolean save(AmbulanceDTO dto) {
		if (dto != null) {
			
			if (validate.validDTO(dto)) {
				System.out.println("No constraint violatino found in dto "+dto);
				return this.ambulanceRepository.save(dto);
			}
		}
		System.out.println("dto is null ");
		return false;
	}

}
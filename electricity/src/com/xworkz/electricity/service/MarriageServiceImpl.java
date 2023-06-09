package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.MarriageDTO;
import com.xworkz.electricity.repository.MarriageRepository;
import com.xworkz.electricity.util.ValidationUtil;

public class MarriageServiceImpl implements MarriageService {
	//declare than inbuilt
	private ValidationUtil<MarriageDTO> validate =new ValidationUtil<>();
	private MarriageRepository marriageRepository;

	public MarriageServiceImpl(MarriageRepository marriageRepository) {
		this.marriageRepository = marriageRepository;
	}

	@Override
	public boolean validateAndThenSave(MarriageDTO dto) {
		System.out.println("Running validate and save:" + dto);

		
		if (validate.validDTO(dto)) {
			System.out.println("No Violations in Constraints");
			return this.marriageRepository.save(dto);
		}
		
		System.out.println("There exists violation and hence will not be saved");
		return false;
	}

}

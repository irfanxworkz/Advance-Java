package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.Constraint;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.MarriageDTO;
import com.xworkz.electricity.dto.PoliceStationDTO;
import com.xworkz.electricity.repository.PoliceStationRepository;
import com.xworkz.electricity.util.ValidationUtil;

public class PoliceStationServiceImpl implements PoliceStationService {
	
	private ValidationUtil<PoliceStationDTO> validate =new ValidationUtil<>();
	
	private PoliceStationRepository policeStationRepository;

	public PoliceStationServiceImpl(PoliceStationRepository policeStationRepository) {
		super();
		System.out.println("PoliceServicesImpl const with policeStationRepository");
		this.policeStationRepository = policeStationRepository;
	}


	@Override
	public Boolean validateAndThenSave(PoliceStationDTO dto) {
		System.out.println("Running Validate and save Methods in Service");
		
		if(dto != null) {
			System.out.println("dto is not null");
			
			//Using UtilClass THis line code in services impl
			
			/*
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			
			Set<ConstraintViolation<PoliceStationDTO>> constraintViolations = validator.validate(dto);
			System.out.println("Total Violations : "+constraintViolations.size());
			
			constraintViolations.forEach(cv-> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));
			*/
			
			if(validate.validDTO(dto)) {
				System.out.println("No Violations in Constraints");
				return this.policeStationRepository.save(dto);
			}
		}
			System.out.println("There exists violation and hence will not be saved");
			return false;
	}

}

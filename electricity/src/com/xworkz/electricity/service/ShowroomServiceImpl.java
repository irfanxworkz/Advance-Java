package com.xworkz.electricity.service;

import com.xworkz.electricity.dto.ShowroomDTO;
import com.xworkz.electricity.repository.ShowroomRepository;
import com.xworkz.electricity.util.ValidationUtil;

public class ShowroomServiceImpl implements ShowroomService {
	
	private ValidationUtil<ShowroomDTO> validate =new ValidationUtil<>();
	
	private ShowroomRepository showroomRepository;
	
	public ShowroomServiceImpl(ShowroomRepository showroomRepository) {
		this.showroomRepository = showroomRepository;
	}

	@Override
	public boolean validateAndThanSave(ShowroomDTO dto) {
		System.out.println("Running validateAndThanSave in ShowroomServiceImpl: " + dto);
		if (dto != null) {
			System.out.println("dto is not null");
			
			/*
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			
			Set<ConstraintViolation<ShowroomDTO>> constraintViolations = validator.validate(dto);
			
			System.out.println("Total violation :" + constraintViolations.size());
			constraintViolations.forEach(cv -> System.err.println(cv.getPropertyPath() + " " + cv.getMessage()));
			*/
			
			if (validate.validDTO(dto)) {
				System.out.println("no violation in constraintViolations");
				return this.showroomRepository.save(dto);
			}

		}
		
		System.out.println("There exists violation and hence will not be saved");
		
		return false;
	}

}

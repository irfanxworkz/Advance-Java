package com.xworkz.showroom.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.DTO.PolishDTO;
import com.xworkz.showroom.repositry.PolishRepositry;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PolishServicesImpl implements PolishServices {

	private PolishRepositry polishRepositry;
	private Validator validator;
	
	@Override
	public boolean validateAndSave(PolishDTO dto) {
			System.out.println("running ValidateAndSave method:"+dto);
		if(dto !=null) {
			System.out.println("dto is not null");
			
			Set<ConstraintViolation<PolishDTO>> constraintViolations = this.validator.validate(dto);
			System.out.println(constraintViolations.size());
			
			constraintViolations.forEach(e-> System.out.println(e.getPropertyPath()+" "+e.getMessage()));
			if(constraintViolations.isEmpty()) {
				System.out.println("no violation and hence will be saved ");
				return this.polishRepositry.save(dto);
			}
			else {
				System.out.println("There are Violance");
			}
			
		}
		else {
			System.out.println("dto is null");
		}
		return false;
	}

}

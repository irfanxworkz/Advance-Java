package com.xworkz.showroom.services;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.DTO.ShowroomDTO;
import com.xworkz.showroom.repositry.ShowroomRepositry;


import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ShowroomServicesImpl implements ShowroomServices{
	
	
	private ShowroomRepositry showroomRepositry;
	private Validator validator;

	@Override
	public boolean validateAndSave(ShowroomDTO dto) {
		System.out.println("Running validate And Save Method"+dto);
		if(dto !=null) {
			System.out.println("dto is not Null..");
			
			Set<ConstraintViolation<ShowroomDTO>> constraintViolations=this.validator.validate(dto);
			System.out.println(constraintViolations.size());
			
			constraintViolations.forEach(e-> System.out.println(e.getPropertyPath()+ " " +e.getMessage()));
			
			if(constraintViolations.isEmpty()) {
				System.out.println("no violation and hence will be saved ");
	
				return this.showroomRepositry.save(dto);
			}
			else {
				System.out.println("There are Violance");

			}
		}
		else {
			System.out.println("dto is null...");
		}
		return false;
	}

}

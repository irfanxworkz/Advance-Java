package com.xworkz.showroom.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.DTO.SalesManagerDTO;
import com.xworkz.showroom.repositry.SalesManagerRepositry;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalesManagerServicesImpl implements SalesManagerServices{
	
	private SalesManagerRepositry salesManagerRepositry;
	private Validator validator;

	@Override
	public boolean validateAndSave(SalesManagerDTO dto) {
		System.out.println("running validateandSave Method: "+dto);
		if(dto !=null) {
			System.out.println("dto is not null");
			
			Set<ConstraintViolation<SalesManagerDTO>> constraintViolations = this.validator.validate(dto);
			System.out.println(constraintViolations.size());
			
			constraintViolations.forEach(e-> System.out.println(e.getPropertyPath()+" "+e.getMessage()));
			if(constraintViolations.isEmpty()) {
				System.out.println("no violation and hence will be saved:");
				
				return this.salesManagerRepositry.save(dto);
			}
			else {
				System.out.println("There are violation..");
			}
		}
		else {
			System.out.println("dto is null");
		}
		return false;
	}


}

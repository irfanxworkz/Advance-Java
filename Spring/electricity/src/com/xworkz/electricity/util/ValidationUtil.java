package com.xworkz.electricity.util;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class ValidationUtil<T> {
	
	public boolean validDTO(T t) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<T>> cv = validator.validate(t);
		System.out.println(cv.size());
		cv.forEach(v -> System.out.println(v.getPropertyPath() + " " + v.getMessage()));
		
		return cv.isEmpty();
		
		
		
	}

}

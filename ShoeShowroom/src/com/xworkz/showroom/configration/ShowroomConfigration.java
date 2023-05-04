package com.xworkz.showroom.configration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.showroom")
public class ShowroomConfigration {
	
	public ShowroomConfigration() {
		System.out.println("no-arg Constructor form ShowroomConfigration class...");
	}

	@Bean
	public Validator validator() {
		System.out.println("Registering validator");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		return validator;
	}
	
/*	
	public String name() {
		System.out.println("running Showroom Name ....");
		return "Puma";
		
	}
	
	public String address() {
		System.out.println("running Showroom address ....");
		return "Rajaji-Nagar";
		
	}
	
	
	public String gstNo() {
		System.out.println("running Showroom gstNo ....");
		return "nxtvn654397vt";
		
	}
	
	public String id() {
		System.out.println("running Showroom id ....");
		return "5";
		
	}
*/
	
}

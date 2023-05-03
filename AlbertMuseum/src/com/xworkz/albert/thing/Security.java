package com.xworkz.albert.thing;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@ToString
@AllArgsConstructor
public class Security {
	
	private String securityType;
	private int noOfMaleStaff,noOfFemalStaff;
	private Thing thing;
	
	

}

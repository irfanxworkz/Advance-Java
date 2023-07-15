package com.xworkz.albert.thing;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@ToString
@AllArgsConstructor
public class Guide {
	
	private String guideName;
	private int guideFee,noOfGuide;
	private Security security;
	

}

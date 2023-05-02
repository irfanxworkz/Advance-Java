package com.xworkz.project.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Component
@NoArgsConstructor
@Setter
@ToString
public class Router {
	
	@Value("Airtel")
	private String brand;
	@Value("1.2")
	private double speed;
	@Value("1800")
	private int bill;
	
	

}

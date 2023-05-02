package com.xworkz.project.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Setter
@Component
@ToString
public class Spray {
	
	@Value("Titan")
	private String brand;
	@Value("3000")
	private int price;
	@Value("Perfume")
	private String type;
	
	public Spray() {
		System.out.println("no-arg constructor");
	}
	
	public void order() {
		System.out.println("invoked orger method from Spray Class");
	}

}

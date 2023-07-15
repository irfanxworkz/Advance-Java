package com.xworkz.project.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@NoArgsConstructor
@Setter
public class PowerBank {
	
	@Value("protronics")
	private String brand;
	@Value("Type C")
	private String inputType;

	private int price;
	@Value("10000")
	private int noOfMAH;
	@Value("2")
	private int Wrantty;
	@Value("4")
	private int noOfOutputCalble;

}

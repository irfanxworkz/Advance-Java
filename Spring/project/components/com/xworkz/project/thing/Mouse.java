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
public class Mouse {
	
	@Value("SWISS")
	private String brand;
	@Value("Black")
	private String color;
	@Value("Wireless")
	private String type;
	@Value("1200")
	private int price;
	private int warranty;

}

package com.xworkz.project.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class CoolingPad {
	
	private String brand;
	private String usedFor;
	private String color;
	private String design;
	private String material;
	private int price;
	private int warranty;
	private int noOfFan;
	private double size;
	
	public CoolingPad(@Value("Square") String design,@Value("Plastic") String material,@Value("1500") int price,@Value("1") int warranty,@Value("4") int noOfFan,@Value("15.5") double size) {
		super();
		this.design = design;
		this.material = material;
		this.price = price;
		this.warranty = warranty;
		this.noOfFan = noOfFan;
		this.size = size;
	}

	@Value("SWISS")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Value("Laptop")
	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}
	
	@Value("Black")
	public void setColor(String color) {
		this.color = color;
	}

	

}

package com.xworkz.project.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Earphones {
	
	private String brand;
	private String color;
	private String type;
	private String usedBy;
	private String material;
	private String bass;
	private int price;
	private int warranty;
	private int driver;
	private double size;
	
	public Earphones(@Value("JBL") String brand,@Value("WHITE") String color,@Value("Wireless") String type,@Value("Men") String usedBy,@Value("multi") String material,@Value("High") String bass,@Value("7000") int price,
			@Value("2") int warranty,@Value("19") int driver,@Value("12.5") double size) {
		super();
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.usedBy = usedBy;
		this.material = material;
		this.bass = bass;
		this.price = price;
		this.warranty = warranty;
		this.driver = driver;
		this.size = size;
	}
	
	

}

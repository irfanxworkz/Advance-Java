package com.xworkz.saloon.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Trimmer {
	
	@Value("Philips")
	private String brand;
	
	private String color;
	private double price,height;
	
	public Trimmer(@Value("1500") double price,@Value("7.2") double height) {
		super();
		this.price = price;
		this.height = height;
	}

	@Value("Silver")
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Trimmer [brand=" + brand + ", color=" + color + ", price=" + price + ", height=" + height + "]";
	}

	
	
}

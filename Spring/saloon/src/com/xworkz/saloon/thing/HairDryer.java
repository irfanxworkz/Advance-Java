package com.xworkz.saloon.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HairDryer {
	
	private String brand;
	
	@Value(" Ionic hair dryer")
	private String type;
	
	private String color;
	private double weight;
	
	@Value("110000")
	private int rpm;

	public HairDryer(@Value("PHILIPS") String brand,@Value("BLACK") String color) {
		super();
		this.brand = brand;
		this.color = color;
	}

	@Value("350")
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "HairDryer [brand=" + brand + ", type=" + type + ", color=" + color + ", weight=" + weight + ", rpm="
				+ rpm + "]";
	}
	
	

}

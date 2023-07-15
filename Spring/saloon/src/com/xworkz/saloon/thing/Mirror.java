package com.xworkz.saloon.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mirror {
	
	@Value("Square")
	private String shape;
	private double height;
	private double weight;
	
	public Mirror(@Value("5.5") double height) {
		super();
		this.height = height;
	}

	public void setWeight(@Value("2.2") double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Mirror [shape=" + shape + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
	

}

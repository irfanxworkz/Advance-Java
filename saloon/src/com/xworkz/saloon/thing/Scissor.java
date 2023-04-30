package com.xworkz.saloon.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Scissor {
	
	private String type;
	@Value("35.5")
	private double weight;
	private String color;

	@Value("Gold")
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setType(@Value("Long-Bladed Scissors") String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Scissor [type=" + type + ", weight=" + weight + ", color=" + color + "]";
	}
	
	
	
	
	

}

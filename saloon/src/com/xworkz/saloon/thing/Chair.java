package com.xworkz.saloon.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chair {
	
	@Value("Black")
	private String color;
	private String shape;
	private String type;
	
	@Value("Round")
	public void setShape( String shape) {
		this.shape = shape;
	}
	public void setType(@Value("Sofa") String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Chair [color=" + color + ", shape=" + shape + ", type=" + type + "]";
	}
	
	
	
	
	
}

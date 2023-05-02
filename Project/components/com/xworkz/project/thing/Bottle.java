package com.xworkz.project.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bottle {
	
	private String brand;
	private String name;
	private String usedFor;
	private String material;
	private String color;
	private String shape;
	private String capeType;
	private String Type;
	@Value("250")
	private int pricePerBottle;
	@Value("10")
	private int noOfBottlePerBox;
	@Value("2000")
	private int priceBox;
	private double bottleSize;
	private double diameter;
	private double height;
	
	public Bottle(@Value("DECATHLON") String brand,@Value("BTWIN") String name,@Value("Men") String usedFor,@Value("Steel") String material,@Value("Silver") String color,@Value("Round") String shape,
			@Value("lock type") String capeType,@Value("Water Bottle") String type) {
		super();
		this.brand = brand;
		this.name = name;
		this.usedFor = usedFor;
		this.material = material;
		this.color = color;
		this.shape = shape;
		this.capeType = capeType;
		Type = type;
	}
	
	@Value("1.2")
	public void setBottleSize(double bottleSize) {
		this.bottleSize = bottleSize;
	}
	
	@Value("4.5")
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	@Value("10.5")
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Bottle [brand=" + brand + ", name=" + name + ", usedFor=" + usedFor + ", material=" + material
				+ ", color=" + color + ", shape=" + shape + ", capeType=" + capeType + ", Type=" + Type
				+ ", pricePerBottle=" + pricePerBottle + ", noOfBottlePerBox=" + noOfBottlePerBox + ", priceBox="
				+ priceBox + ", bottleSize=" + bottleSize + ", diameter=" + diameter + ", height=" + height + "]";
	}
	
	

}

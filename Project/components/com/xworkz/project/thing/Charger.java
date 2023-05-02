package com.xworkz.project.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Charger {
	
	
	private String brand;
	private String type;
	private String color;
	private String metarial;
	
	private int noOfOutputSocket;
	private int wrantty;
	
	private double weight;
	private double price;
	private double watt;
	
	public Charger(@Value("Apple") String brand,@Value("Apple Adapter") String type,@Value("white") String color,@Value("multi") String metarial,@Value("1") int noOfOutputSocket,@Value("6") int wrantty,
			@Value("200") double weight,@Value("2000") double price,@Value("20") double watt) {
		super();
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.metarial = metarial;
		this.noOfOutputSocket = noOfOutputSocket;
		this.wrantty = wrantty;
		this.weight = weight;
		this.price = price;
		this.watt = watt;
	}

	@Override
	public String toString() {
		return "Charger [brand=" + brand + ", type=" + type + ", color=" + color + ", metarial=" + metarial
				+ ", noOfOutputSocket=" + noOfOutputSocket + ", wrantty=" + wrantty + ", weight=" + weight + ", price="
				+ price + ", watt=" + watt + "]";
	}
	
	
	
	
}

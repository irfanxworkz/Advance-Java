package com.xworkz.project.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bag {
	
	@Value("HP")
	private String brand;
	@Value("Black")
	private String color;
	@Value("Leather")
	private String material;
	@Value("Laptop bag")
	private String type;
	@Value("Men")
	private String usedFor;
	
	
	private int price;
	private int noOfCompartment;
	private int noOfZip;
	private int noOfInnerPocket;
	private int warranty;
	private double length;
	private double width;
	
	
	private double depth;
	
	private boolean waterProof;
	
	private boolean lock;
	public Bag(@Value("3500") int price,@Value("3") int noOfCompartment,@Value("4") int noOfZip,@Value("3") int noOfInnerPocket,@Value("5") int warranty,@Value("17.5") double length,@Value("6.5")
			double width) {
		super();
		this.price = price;
		this.noOfCompartment = noOfCompartment;
		this.noOfZip = noOfZip;
		this.noOfInnerPocket = noOfInnerPocket;
		this.warranty = warranty;
		this.length = length;
		this.width = width;
	
	}
	@Value("3.5")
	public void setDepth(double depth) {
		this.depth = depth;
	}
	@Value("true")
	public void setWaterProof(boolean waterProof) {
		this.waterProof = waterProof;
	}
	@Value("false")
	public void setLock(boolean lock) {
		this.lock = lock;
	}
	@Override
	public String toString() {
		return "Bag [brand=" + brand + ", color=" + color + ", material=" + material + ", type=" + type + ", usedFor="
				+ usedFor + ", price=" + price + ", noOfCompartment=" + noOfCompartment + ", noOfZip=" + noOfZip
				+ ", noOfInnerPocket=" + noOfInnerPocket + ", warranty=" + warranty + ", length=" + length + ", width="
				+ width + ", depth=" + depth + ", waterProof=" + waterProof + ", lock=" + lock + "]";
	}
	
	
	
	
	
	
	

}

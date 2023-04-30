package com.xworkz.saloon.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShavingCream {
	
	@Value("Ponds")
	private String brand;
	private double price,quantity;
	
	public ShavingCream(@Value("750") double price) {
		super();
		this.price = price;
	}
	
	@Value("10")
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ShavingCream [brand=" + brand + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}

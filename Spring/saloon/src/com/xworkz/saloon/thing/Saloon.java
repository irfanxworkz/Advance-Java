package com.xworkz.saloon.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Saloon {
	
	private String name,ownerName,type,location;
	private int noOfBarbers;
	
	public Saloon(@Value("Bounce Unisex Salon") String name,@Value("Sandeep Kumar Singh") String ownerName,@Value("Beauty Parlour") String type,@Value("Lavelle Road") String location,@Value("5") int noOfBarbers) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.location = location;
		this.noOfBarbers = noOfBarbers;
	}

	@Override
	public String toString() {
		return "Saloon [name=" + name + ", ownerName=" + ownerName + ", type=" + type + ", location=" + location
				+ ", noOfBarbers=" + noOfBarbers + "]";
	}
	
	
	

}

package com.xworkz.albert.thing;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@AllArgsConstructor
@ToString
public class SensoredDoor {

	private String doorType;
	private int noOfDoor;
	private double cost;
	private Camera camera;
	
}

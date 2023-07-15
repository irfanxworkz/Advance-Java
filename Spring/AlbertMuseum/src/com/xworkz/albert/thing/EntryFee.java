package com.xworkz.albert.thing;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@AllArgsConstructor
@ToString
public class EntryFee {
	
	private double fee;
	private SensoredDoor sensoredDoor;

}

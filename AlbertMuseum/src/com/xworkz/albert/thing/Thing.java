package com.xworkz.albert.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Thing {
	
	@Autowired
	private String painting,statue,jewelry,metalSculptures;
	
	

}

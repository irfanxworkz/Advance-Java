package com.xworkz.albert.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Camera {
	
	@Autowired
	private String brand,quality;
	@Autowired
	private int noOfCamera;
	@Autowired
	private Guide guide;

}

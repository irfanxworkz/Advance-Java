package com.xworkz.ice.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SpringController {
	
	public SpringController() {
		System.out.println("Testing SpringController!!!"+this.getClass()+" ");
	}
	
	@RequestMapping( value = "/click")
	public String onClick() {
		System.out.println("testing onClick Method");
		return "/index.jsp";
	}

}

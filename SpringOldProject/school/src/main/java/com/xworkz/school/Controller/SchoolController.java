package com.xworkz.school.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SchoolController {
	
	public SchoolController() {
		System.out.println("creating no-arg Constructor Using SchoolController!!!");
	}

	@RequestMapping(value =  "/click")
	private String onClick() {
		System.out.println("Running OnClick Method Using SchoolController...");
		
		return ("/index.jsp");
	}
}

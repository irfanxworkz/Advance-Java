package com.xworkz.glass.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.glass.configration.SpringConfigration;

public class SpringRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfigration.class);

	}

}

package com.xworkz.showroom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.showroom.DTO.SalesManagerDTO;
import com.xworkz.showroom.configration.ShowroomConfigration;
import com.xworkz.showroom.services.SalesManagerServices;

public class SalesManagerRunner {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ShowroomConfigration.class);
		
		SalesManagerServices services =	applicationContext.getBean(SalesManagerServices.class);
		
		SalesManagerDTO salesManagerDTO = new SalesManagerDTO("Ashok Kumar", "Jaipur", 4.5, 5.5);
		boolean saved = services.validateAndSave(salesManagerDTO);
		System.out.println("Saved: "+saved);

	}

}

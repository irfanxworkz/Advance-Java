package com.xworkz.showroom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.showroom.DTO.PolishDTO;
import com.xworkz.showroom.configration.ShowroomConfigration;
import com.xworkz.showroom.services.PolishServices;

public class PolishRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ShowroomConfigration.class);

		PolishServices polishServices = applicationContext.getBean(PolishServices.class);

		PolishDTO polishDTO = new PolishDTO("Redfox", "Black", "Shoes", 145, 5.5, 20);
		boolean saved = polishServices.validateAndSave(polishDTO);
		System.out.println("Saved:" + saved);

	}

}

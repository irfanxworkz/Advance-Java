package com.xworkz.showroom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.showroom.DTO.ShowroomDTO;
import com.xworkz.showroom.configration.ShowroomConfigration;
import com.xworkz.showroom.services.ShowroomServices;

public class ShowroomRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ShowroomConfigration.class);

		ShowroomServices services = applicationContext.getBean(ShowroomServices.class);

		ShowroomDTO showroomDTO = new ShowroomDTO("Puma", "Rajaji-nagar", "ntswh3487621nm", 10);
		boolean saved = services.validateAndSave(showroomDTO);
		System.out.println("Saved: " + saved);

	}

}

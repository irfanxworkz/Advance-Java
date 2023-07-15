package com.xworkz.showroom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.showroom.DTO.SockDTO;
import com.xworkz.showroom.configration.ShowroomConfigration;
import com.xworkz.showroom.services.SockServices;

public class SockRunner {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ShowroomConfigration.class);
		
		SockServices services=applicationContext.getBean(SockServices.class);
		
		SockDTO sockDTO= new SockDTO("Puma", "Ankel-length", "black", 150, 12.5);
		boolean saved=services.validateAndSave(sockDTO);
		System.out.println("Saved:"+saved);
	}

}

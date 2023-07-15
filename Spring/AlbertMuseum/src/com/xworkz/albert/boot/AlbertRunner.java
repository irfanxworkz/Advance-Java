package com.xworkz.albert.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.albert.configration.AlbertConfigration;
/*
import com.xworkz.albert.thing.Camera;
import com.xworkz.albert.thing.EntryFee;
import com.xworkz.albert.thing.Guide;

import com.xworkz.albert.thing.Security;
import com.xworkz.albert.thing.SensoredDoor;
import com.xworkz.albert.thing.Thing;
*/
import com.xworkz.albert.thing.Museum;

public class AlbertRunner {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AlbertConfigration.class);
		
		System.out.println("Totall Beans: "+applicationContext.getBeanDefinitionCount());
		
	/* 	
		System.out.println("--------------Things-------------------------------------------------------");
		System.out.println(applicationContext.getBean(Thing.class));
		System.out.println("--------------Security-------------------------------------------------------");
		System.out.println(applicationContext.getBean(Security.class));
		System.out.println("--------------Guide-------------------------------------------------------");
		System.out.println(applicationContext.getBean(Guide.class));
		System.out.println("--------------Camera-------------------------------------------------------");
		System.out.println(applicationContext.getBean(Camera.class));
		System.out.println("--------------SensoredDoor-------------------------------------------------------");
		System.out.println(applicationContext.getBean(SensoredDoor.class));
		System.out.println("--------------EntryFee-------------------------------------------------------");
		System.out.println(applicationContext.getBean(EntryFee.class));
	*/	
		System.out.println("--------------Museum-------------------------------------------------------");
		System.out.println(applicationContext.getBean(Museum.class));

	}

}
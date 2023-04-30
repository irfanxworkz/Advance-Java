package com.xworkz.saloon.boot;

import java.util.stream.Stream;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.saloon.configration.SaloonConfigration;
import com.xworkz.saloon.thing.Barber;
import com.xworkz.saloon.thing.Chair;
import com.xworkz.saloon.thing.HairDryer;
import com.xworkz.saloon.thing.Mirror;
import com.xworkz.saloon.thing.Saloon;
import com.xworkz.saloon.thing.Scissor;
import com.xworkz.saloon.thing.ShavingCream;
import com.xworkz.saloon.thing.Trimmer;

public class SaloonRunner {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext =new AnnotationConfigApplicationContext(SaloonConfigration.class);
	
		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println("---------------------------------------------------------------");
		System.out.println("Total Beans count : "+applicationContext.getBeanDefinitionCount());
		System.out.println("---------------------------------------------------------------");
		Stream.of(applicationContext).forEach(e-> System.out.println(e));
		System.out.println("====================================================================");
		System.out.println("====================================================================");
		
		System.out.println(applicationContext.getBean(Barber.class));
		System.out.println("----------------------------------------------------------------");
		System.out.println(applicationContext.getBean(Saloon.class));
		System.out.println("-----------------------------------------------");
		System.out.println(applicationContext.getBean(Scissor.class));
		System.out.println("----------------------------------------------------------------");
		System.out.println(applicationContext.getBean(Chair.class));
		System.out.println("----------------------------------------------------------------");
		System.out.println(applicationContext.getBean(ShavingCream.class));
		System.out.println("----------------------------------------------------------------");
		System.out.println(applicationContext.getBean(Mirror.class));
		System.out.println("----------------------------------------------------------------");
		System.out.println(applicationContext.getBean(HairDryer.class));
		System.out.println("----------------------------------------------------------------");
		System.out.println(applicationContext.getBean(Trimmer.class));
		System.out.println("----------------------------------------------------------------");
		
	
		
	}

}

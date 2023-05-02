package com.xworkz.project.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.project.configration.SpringConfigration;
import com.xworkz.project.thing.Bag;
import com.xworkz.project.thing.Bottle;
import com.xworkz.project.thing.Cable;
import com.xworkz.project.thing.Charger;
import com.xworkz.project.thing.Cigarette;
import com.xworkz.project.thing.CoolingPad;
import com.xworkz.project.thing.Earphones;
import com.xworkz.project.thing.Mobile;
import com.xworkz.project.thing.Mouse;
import com.xworkz.project.thing.PowerBank;
import com.xworkz.project.thing.Router;
import com.xworkz.project.thing.Spray;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfigration.class);
		
		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println("---------------------------------------------------------------");
		System.out.println("Total Beans count : "+applicationContext.getBeanDefinitionCount());
		System.out.println("---------------------------------------------------------------");
		Stream.of(applicationContext).forEach(e-> System.out.println(e));
		System.out.println("====================================================================");
		System.out.println("====================================================================");
		
		Cigarette ref=applicationContext.getBean(Cigarette.class);
		System.out.println(ref);
		ref.order();
		System.out.println("----------------------------------------------------------------");
		
		Bag ref3=applicationContext.getBean(Bag.class);
		System.out.println(ref3);
		ref3.order();
		System.out.println("----------------------------------------------------------------");
		
		System.out.println(applicationContext.getBean(Bottle.class));
		System.out.println("----------------------------------------------------------------");
		

		System.out.println(applicationContext.getBean(Cable.class));
		System.out.println("----------------------------------------------------------------");
		

		System.out.println(applicationContext.getBean(Charger.class));
		System.out.println("----------------------------------------------------------------");
		
		System.out.println(applicationContext.getBean(CoolingPad.class));
		System.out.println("----------------------------------------------------------------");
		
		System.out.println(applicationContext.getBean(Earphones.class));
		System.out.println("----------------------------------------------------------------");
		
		System.out.println(applicationContext.getBean(Mobile.class));
		System.out.println("----------------------------------------------------------------");
		
		System.out.println(applicationContext.getBean(Mouse.class));
		System.out.println("----------------------------------------------------------------");
		
		System.out.println(applicationContext.getBean(PowerBank.class));
		System.out.println("----------------------------------------------------------------");
		
		Router ref1=applicationContext.getBean(Router.class);
		System.out.println(ref1);
		ref1.order();
		System.out.println("----------------------------------------------------------------");
		
		Spray ref2=applicationContext.getBean(Spray.class);
		System.out.println(ref2);
		ref2.order();
		System.out.println("----------------------------------------------------------------");

	}

}

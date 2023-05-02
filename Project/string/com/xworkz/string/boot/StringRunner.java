package com.xworkz.string.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.string.configration.StringConfigration;

public class StringRunner {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StringConfigration.class);

		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println("Total Beans count : "+applicationContext.getBeanDefinitionCount());
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("---------------------String Type--------------------------------");
		System.out.println(applicationContext.getBean("firstName", String.class));
		System.out.println(applicationContext.getBean("lastName", String.class));
		System.out.println(applicationContext.getBean("email", String.class));
		System.out.println(applicationContext.getBean("address", String.class));
		System.out.println(applicationContext.getBean("college", String.class));
		System.out.println(applicationContext.getBean("branch", String.class));
		System.out.println(applicationContext.getBean("section", String.class));
		System.out.println(applicationContext.getBean("gender", String.class));
		System.out.println(applicationContext.getBean("laptop", String.class));
		System.out.println(applicationContext.getBean("phone", String.class));
		System.out.println(applicationContext.getBean("smartWatch", String.class));
		System.out.println(applicationContext.getBean("network", String.class));
		System.out.println(applicationContext.getBean("location", String.class));
		
	}

}

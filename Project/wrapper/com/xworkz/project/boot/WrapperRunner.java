package com.xworkz.project.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.project.configration.WrapperConfigration;

public class WrapperRunner {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(WrapperConfigration.class);
		
		System.out.println("Total Beans count : "+applicationContext.getBeanDefinitionCount());
		System.out.println("-----------Integer Type----------------------------------------------------");
		System.out.println(applicationContext.getBean("id", Integer.class));
		System.out.println(applicationContext.getBean("number", Integer.class));
		System.out.println(applicationContext.getBean("bikeNumber", Integer.class));
		System.out.println(applicationContext.getBean("houseNumber", Integer.class));
		System.out.println(applicationContext.getBean("roomNumber", Integer.class));
		System.out.println(applicationContext.getBean("pinCodeNumber", Integer.class));
		System.out.println(applicationContext.getBean("busNumber", Integer.class));
		System.out.println(applicationContext.getBean("trainNumber", Integer.class));
		System.out.println(applicationContext.getBean("tokenNumber", Integer.class));
		
		System.out.println("-----------Character Type-----------------------------------------------------");
		System.out.println(applicationContext.getBean("apple",Character.class));
		System.out.println(applicationContext.getBean("ball",Character.class));
		System.out.println(applicationContext.getBean("cream",Character.class));
		System.out.println(applicationContext.getBean("dog",Character.class));
		System.out.println(applicationContext.getBean("eye",Character.class));
		System.out.println(applicationContext.getBean("four",Character.class));
		System.out.println(applicationContext.getBean("gun",Character.class));
		System.out.println(applicationContext.getBean("house",Character.class));
		System.out.println(applicationContext.getBean("ice",Character.class));
		
		System.out.println("-----------Long Type-----------------------------------------------------");
		System.out.println(applicationContext.getBean("mobNumber",Long.class));
		System.out.println(applicationContext.getBean("gstNumber",Long.class));
		System.out.println(applicationContext.getBean("invoiceNumber",Long.class));
		System.out.println(applicationContext.getBean("registrationNumber",Long.class));
		System.out.println(applicationContext.getBean("accountNumber",Long.class));
		System.out.println(applicationContext.getBean("uniqueNumber",Long.class));
		System.out.println(applicationContext.getBean("chesisNumber",Long.class));
		System.out.println(applicationContext.getBean("engineNumber",Long.class));
		System.out.println(applicationContext.getBean("otherNumber",Long.class));
	
		System.out.println("-----------Float Type-----------------------------------------------------");
		System.out.println(applicationContext.getBean("length",Float.class));
		System.out.println(applicationContext.getBean("height",Float.class));
		System.out.println(applicationContext.getBean("width",Float.class));
		System.out.println(applicationContext.getBean("weight",Float.class));
		System.out.println(applicationContext.getBean("distance",Float.class));
		System.out.println(applicationContext.getBean("unique",Float.class));
		System.out.println(applicationContext.getBean("destination",Float.class));
		System.out.println(applicationContext.getBean("water",Float.class));
		System.out.println(applicationContext.getBean("balance",Float.class));
		
		System.out.println("-----------Double Type-----------------------------------------------------");
		System.out.println(applicationContext.getBean("len",Double.class));
		System.out.println(applicationContext.getBean("hei",Double.class));
		System.out.println(applicationContext.getBean("wid",Double.class));
		System.out.println(applicationContext.getBean("wei",Double.class));
		System.out.println(applicationContext.getBean("dis",Double.class));
		System.out.println(applicationContext.getBean("uni",Double.class));
		System.out.println(applicationContext.getBean("des",Double.class));
		System.out.println(applicationContext.getBean("wt",Double.class));
		System.out.println(applicationContext.getBean("ac",Double.class));
		
		System.out.println("-----------Byte Type-----------------------------------------------------");
		System.out.println(applicationContext.getBean("speed1",Byte.class));
		System.out.println(applicationContext.getBean("speed2",Byte.class));
		System.out.println(applicationContext.getBean("speed3",Byte.class));
		System.out.println(applicationContext.getBean("speed4",Byte.class));
		System.out.println(applicationContext.getBean("speed5",Byte.class));
		System.out.println(applicationContext.getBean("speed6",Byte.class));
		System.out.println(applicationContext.getBean("speed7",Byte.class));
		System.out.println(applicationContext.getBean("speed8",Byte.class));
		System.out.println(applicationContext.getBean("speed9",Byte.class));
		
		System.out.println("-----------Short Type-----------------------------------------------------");
		System.out.println(applicationContext.getBean("length1",Short.class));
		System.out.println(applicationContext.getBean("length2",Short.class));
		System.out.println(applicationContext.getBean("length3",Short.class));
		System.out.println(applicationContext.getBean("length4",Short.class));
		System.out.println(applicationContext.getBean("length5",Short.class));
		System.out.println(applicationContext.getBean("length6",Short.class));
		System.out.println(applicationContext.getBean("length7",Short.class));
		System.out.println(applicationContext.getBean("length8",Short.class));
		System.out.println(applicationContext.getBean("length9",Short.class));
	
		System.out.println("-----------Boolean Type-----------------------------------------------------");
		System.out.println(applicationContext.getBean("condition1",Boolean.class));
		System.out.println(applicationContext.getBean("condition2",Boolean.class));
		System.out.println(applicationContext.getBean("condition3",Boolean.class));
		System.out.println(applicationContext.getBean("condition4",Boolean.class));
		System.out.println(applicationContext.getBean("condition5",Boolean.class));
		System.out.println(applicationContext.getBean("condition6",Boolean.class));
		System.out.println(applicationContext.getBean("condition7",Boolean.class));
		System.out.println(applicationContext.getBean("condition8",Boolean.class));
		System.out.println(applicationContext.getBean("condition9",Boolean.class));
		
	}

}

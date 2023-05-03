package com.xworkz.albert.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.albert")
public class AlbertConfigration {

	public AlbertConfigration() {
		System.out.println("no-arg Constructor from AlbertConfigration class...");
	}
	
	//--------------------------------------------------------------------	
	
	@Bean
	public String painting() {
		System.out.println("running from painting...");
		return "Mona Lisa";
	}
	@Bean
	public String statue() {
		System.out.println("running from statue...");
		return "The Prince Consort Statue";
		
	}
	@Bean
	public String jewelry() {
		System.out.println("running from jewelry...");
		return "Fashion Jewellery.";
		
	}
	@Bean
	public String metalSculptures() {
		System.out.println("running from metalSculptures...");
		return "Garden Egg Chair";
		
	}
	
	//--------------------------------------------------------------------	
	
	@Bean
	public String securityType() {
		System.out.println("running from securityType");
		return "RP";
		
	}
	@Bean
	public Integer noOfMaleStaff() {
		System.out.println("running from noOfMaleStaff");
		return 10;
		
	}
	@Bean
	public Integer noOfFemalStaff() {
		System.out.println("running from noOfFemalStaff");
		return 5;
		
	}
	
	//--------------------------------------------------------------------	
	
	@Bean
	public String guideName() {
		System.out.println("running from guideName...");
		return "Ashok Kumar";
		
	}
	
	@Bean
	public Integer guideFee() {
		System.out.println("running from guideFee...");
		return 500;
		
	}
	
	@Bean
	public Integer noOfGuide() {
		System.out.println("running from noOfGuide...");
		return 5;
		
	}
	
	//--------------------------------------------------------------------	
	
	@Bean
	public String quality() {
		System.out.println("running from quality...");
		return "Sony";
		
	}
	
	@Bean
	public String brand() {
		System.out.println("running from brand...");
		return "High";
		
	}
	
	@Bean
	public Integer noOfCamera() {
		System.out.println("running from noOfCamera...");
		return 20;

	}
	
	//--------------------------------------------------------------------	
	
	@Bean
	public String doorType() {
		System.out.println("running from doorType...");
		return "Automatic";
		
	}
	
	@Bean
	public Integer noOfDoor() {
		System.out.println("running from noOfDoor...");
		return 3;

	}
	
	@Bean
	public Double cost() {
		System.out.println("running from cost...");
		return 250000d;

	}
	
	//--------------------------------------------------------------------	
	
	@Bean
	public Double fee() {
		System.out.println("running from fee...");
		return 100d;
	}
	
	//---------------------------------------------------------------------
	
	@Bean
	public String museumName() {
		System.out.println("running from museumName...");
		return "Albert Museum";
		
	}
	
}
	
	

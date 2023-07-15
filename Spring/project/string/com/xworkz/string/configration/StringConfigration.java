package com.xworkz.string.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.string")
public class StringConfigration {

	public StringConfigration() {
		System.out.println("no-arg Constructor from StringConfigration Class...");
	}

	@Bean
	public String firstName() {
		System.out.println("registering firstName...");
		return "Irfan";
	}
	@Bean
	public String lastName() {
		System.out.println("registering lastName...");
		return "Khan";
	}
	@Bean
	public String email() {
		System.out.println("registering email...");
		return "Irfan.xworkz@gmail.com";
	}
	@Bean
	public String address() {
		System.out.println("registering address...");
		return "Jaipur, Rajasthan";
	}
	@Bean
	public String college() {
		System.out.println("registering college...");
		return "PIET";
	}
	@Bean
	public String branch() {
		System.out.println("registering branch...");
		return "CSE";
	}
	@Bean
	public String section() {
		System.out.println("registering section...");
		return "CS-A";
	}
	@Bean
	public String gender() {
		System.out.println("registering gender...");
		return "Male";
	}
	@Bean
	public String laptop() {
		System.out.println("registering laptop...");
		return "HP";
	}
	@Bean
	public String phone() {
		System.out.println("registering phone...");
		return "Apple";
	}
	@Bean
	public String smartWatch() {
		System.out.println("registering smartWatch...");
		return "Fire-Boult";
	}
	@Bean
	public String network() {
		System.out.println("registering network...");
		return "Airtel";
	}
	@Bean
	public String location() {
		System.out.println("registering location...");
		return "Kurubarahalli";
	}
	
}
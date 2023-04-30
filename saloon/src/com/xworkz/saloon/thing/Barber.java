package com.xworkz.saloon.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Barber {
	
	private String name,gender;
	private double exp,salary,age;
	private long contactNo;
	
	public Barber(@Value("Rahul") String name,@Value("Male") String gender,@Value("2.5") double exp,@Value("35255") double salary,@Value("25.5")double age, @Value("9876543558") long contactNo) {
		super();
		this.name = name;
		this.gender = gender;
		this.exp = exp;
		this.salary = salary;
		this.age = age;
		this.contactNo = contactNo;
	}
	
	@Override
	public String toString() {
		return "Barber [name=" + name + ", gender=" + gender + ", exp=" + exp + ", salary=" + salary + ", age=" + age
				+ ", contactNo=" + contactNo + "]";
	}
	
	
	

}

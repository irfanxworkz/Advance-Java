package com.xworkz.donation.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Data

public class BloodDonationDTO implements Serializable,Comparable<BloodDonationDTO>{

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 20, message = "Person name shoud be 2 to 20 character" )
	private String pName;
	@NotNull
	private String group;

	@Min(value = 18, message = "Age greater than 18 ")
	private long age;
	
	private long contact;
	@Min (value = 50, message = "weight shoud be be 50 to 95")
	private double weight;
	
	@NotEmpty
	private String donationDate;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 500, message = "adress shoud be be 2 to 500")
	private String address;

	private String fileName;
	
	private String contentType;
	
	private long fileSize;
	
	@Override
	public int compareTo(BloodDonationDTO o) {
		System.out.println("Running comparing method in BloodDonationDTO...");
		return getPName().compareTo(o.getPName());
	}
}

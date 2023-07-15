package com.xworkz.donation.entity;

import lombok.Data;

@Data
public class DonationEntity {

	private String pName;
	private String group;
	private long age;
	private long contact;
	private double weight;
	private String donationDate;
	private String address;
	private String fileName;
	private String contentType;
	private long fileSize;
}

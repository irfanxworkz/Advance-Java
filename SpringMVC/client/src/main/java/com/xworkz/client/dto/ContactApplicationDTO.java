package com.xworkz.client.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class ContactApplicationDTO implements Serializable{


	private String name;
	private String email;
	private String country;
	private long mobile;
	private String type;
	private String desc;
	
	}

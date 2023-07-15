package com.xworkz.client.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@ToString
@Setter
@Getter
public class ClientDTO {

	public ClientDTO() {
		System.out.println("creating no-arg ClientDTO");
	}
	
	private String userName;
	private String password;
}

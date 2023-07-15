package com.xworkz.bar.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class BarDTO implements Serializable{

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 20)
	private String barName;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 10)
	private String licenceNo;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 10)
	private String barType;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50)
	private String location;
	private long totalStaff;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 20)
	private String stock;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 15)
	private String alcohol;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 10)
	private String status;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 10)
	private String gender;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 400)
	private String feedback;
}

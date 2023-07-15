package com.xworkz.electricity.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AmbulanceDTO implements Serializable, Comparable<AmbulanceDTO> {

	@Min(value = 1)
	@Max(value = 100)
	private int id;
	
	@Min(value = 1)
	@Max(value = 10000)
	private int regNo;
	
	@Min(value = 1)
	@Max(value = 10000000)
	private long chasisNo;
	
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 40)
	private String ownerName;
	
	@Past
	private LocalDate insuranceExpired;
	
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 40)
	private String driverName;
	
	@Future
	private LocalDate taxStartDate;

	
	@Override
	public int compareTo(AmbulanceDTO o) {
		System.out.println("running compare to method");
			return this.getDriverName().compareTo(o.getDriverName());
		
	
	}
}
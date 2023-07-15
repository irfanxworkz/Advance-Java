package com.xworkz.showroom.DTO;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalesManagerDTO implements Serializable, Comparable<SalesManagerDTO>{
	
	
	@NotNull
	@NotEmpty
	@Size(max = 20, min = 2)
	private String name,address;
	@NotNull
	@Max(value = 1000)
	@Min(value = 2)
	private double salary,experience;

	@Override
	public int compareTo(SalesManagerDTO o) {
		
		return this.getName().compareTo(name);
	}

}

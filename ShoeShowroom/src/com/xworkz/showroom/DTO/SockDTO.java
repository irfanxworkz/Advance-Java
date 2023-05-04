package com.xworkz.showroom.DTO;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SockDTO implements Serializable, Comparable<SockDTO>{
	
	@NotNull
	@NotEmpty
	@Size(max = 20, min = 2)
	private String brand,type,color;
	@NotNull
	@Max(value = 1000)
	@Min(value = 2)
	private double price,size;

	@Override
	public int compareTo(SockDTO o) {
		
		return this.getType().compareTo(type);
	}

}

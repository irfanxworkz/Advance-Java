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
public class PolishDTO implements Serializable,Comparable<PolishDTO>{

	@NotNull
	@NotEmpty
	@Size(max = 20, min = 2)
	private String brand,color,used;
	@NotNull
	@Max(value = 1000)
	@Min(value = 2)
	private double price,boxSize,noOfBox;
	
	
	
	@Override
	public int compareTo(PolishDTO o) {
		
		return this.getBrand().compareTo(o.brand);
	}

}

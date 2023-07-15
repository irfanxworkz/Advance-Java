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
public class ShowroomDTO implements Serializable,Comparable<ShowroomDTO>{
	
	@NotNull
	@NotEmpty
	@Size(max = 20, min = 2)
	private String name,address,gstNo;
	@NotNull
	@Max(value = 100)
	@Min(value = 2)
	private int id;
	
	@Override
	public int compareTo(ShowroomDTO o) {
		
		return this.getAddress().compareTo(o.address);
	}


}

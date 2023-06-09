package com.xworkz.electricity.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xworkz.electricity.constant.NumberOfCell;

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
public class PoliceStationDTO implements Serializable, Comparable<PoliceStationDTO>{

	@Min(value = 1)
	@Max(value = 100)
	private int id;
	
	@NotBlank
	@NotNull
	@Size(min = 3, max = 20)
	private String name;
	
	@Min(value = 100)
	@Max(value = 10000)
	private double area;
	
	@NotNull
	private NumberOfCell noOfCells;
	
	@NotEmpty
	@Size(min = 4, max = 30)
	private String inspectorName;


	@Override
	public int compareTo(PoliceStationDTO o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}

}

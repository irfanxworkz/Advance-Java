package com.xworkz.electricity.dto;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.time.DurationMax;
import org.hibernate.validator.constraints.time.DurationMin;

import com.xworkz.electricity.constant.ShowroomLocation;

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
public class ShowroomDTO implements Serializable, Comparable<ShowroomDTO> {
	
	@NotNull
	@Max(value = 100)
	@Min(value = 2)
	private int id;
	
	@NotNull
	@NotEmpty
	@Size(max = 20, min = 2)
	private String name;

	@NotNull
	private ShowroomLocation location;
	
	@Min(value = 1)
	@Max(value = 99999999)
	private long number;

	@PastOrPresent
	private LocalDate openDate;
	private boolean closed;

	
	@Override
	public int compareTo(ShowroomDTO o) {
		
		return this.getName().compareTo(o.getName());
	}


}

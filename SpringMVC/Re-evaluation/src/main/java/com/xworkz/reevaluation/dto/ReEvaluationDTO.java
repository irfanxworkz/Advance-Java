package com.xworkz.reevaluation.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;


@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Slf4j
public class ReEvaluationDTO implements Serializable, Comparable<ReEvaluationDTO>{

	@Size(min = 3, max = 20, message ="student name must be btw 3 and 45")
	private String studentName;
	@NotEmpty(message = "you must choose any one of the subjects")
	private String subject;
	@Size(min = 3, max = 50, message = "college name must be btw 3 and 45")
	private String collegeName;
	@Max(value = 39,message = "only for those subject which you have got below or equals to 39")
	private double marks;
	
	private String fileName;
	
	private String contentType;
	
	private long fileSize;
	
	public ReEvaluationDTO() {
		log.info("Creating no-arg constructor using ReEvaluationDTO !!!");
	}
	
	@Override
	public int compareTo(ReEvaluationDTO o) {
		log.info("running compareTo method in ReEvaluationDTO");
		return this.getStudentName().compareTo(o.getStudentName());
	}
}

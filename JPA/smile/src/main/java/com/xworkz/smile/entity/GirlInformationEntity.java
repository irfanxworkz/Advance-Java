package com.xworkz.smile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Table(name = "girl_information")
@Entity

@NamedQuery(name = "findAll" , query = "select girl from GirlInformationEntity as girl")
@NamedQuery(name = "update", query = "select byupdate from GirlInformationEntity as byupdate where byupdate.name=:byname")
public class GirlInformationEntity {
	
	@Id
	@Column(name = "g_id")
	private int id;
	
	@Column(name = "g_name")
	private String name;
	
	@Column(name = "g_location")
	private String location;
	
	@Column(name = "g_education")
	private String education;
	
	@Column(name = "g_age")
	private int age;
	
	@Column(name = "g_height")
	private double height;
	
	@Column(name = "g_weight")
	private double weight;
	
}

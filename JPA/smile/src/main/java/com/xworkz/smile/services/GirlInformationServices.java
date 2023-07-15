package com.xworkz.smile.services;

import java.util.List;

import com.xworkz.smile.entity.GirlInformationEntity;

public interface GirlInformationServices {
	
	public boolean onValidateAndSave(GirlInformationEntity entity);
	
	public GirlInformationEntity findById(int id);
	
	public List<GirlInformationEntity> findAll();
	
	public boolean update(String name,int id);

}

package com.xworkz.smile.repository;

import java.util.List;

import com.xworkz.smile.entity.GirlInformationEntity;

public interface GirlInformationRepository {
	
	public boolean onSave(GirlInformationEntity entity);

	public GirlInformationEntity findById(int id);
	
	public List<GirlInformationEntity> findAll();
	
	public boolean update(String name,int id);
}

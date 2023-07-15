package com.xworkz.smile.services;

import java.util.List;

import com.xworkz.smile.entity.GirlInformationEntity;
import com.xworkz.smile.repository.GirlInformationRepositoryImpl;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GirlInformationServicesImpl implements GirlInformationServices{

	private GirlInformationRepositoryImpl repo;
	
	public GirlInformationServicesImpl() {
		System.out.println("creating no-arg constructor using GirlInformationServicesImpl!!!");
	}
	
	@Override
	public boolean onValidateAndSave(GirlInformationEntity entity) {
		System.out.println("running onValidateAndSave Method in GirlInformationServicesImpl....");
		boolean saved=false;
		if(entity != null) {
			saved=this.repo.onSave(entity);
			return saved;
		}
		
		return saved;
	}

	@Override
	public GirlInformationEntity findById(int id) {
		System.out.println("running findById method in GirlInformationServicesImpl");
		GirlInformationEntity reference = this.repo.findById(id);
		return reference;
	}

	@Override
	public List<GirlInformationEntity> findAll() {
		
		return this.repo.findAll();
	}

	@Override
	public boolean update(String name, int id) {
		// TODO Auto-generated method stub
		return this.repo.update(name,id);
	}

}

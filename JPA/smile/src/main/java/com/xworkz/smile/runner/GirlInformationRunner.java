package com.xworkz.smile.runner;

import java.util.List;

import com.xworkz.smile.entity.GirlInformationEntity;
import com.xworkz.smile.repository.GirlInformationRepositoryImpl;
import com.xworkz.smile.services.GirlInformationServicesImpl;

public class GirlInformationRunner {

	public static void main(String[] args) {
		
		GirlInformationEntity girlInformationEntity = new GirlInformationEntity();
		girlInformationEntity.setId(3);
		girlInformationEntity.setName("Katrina kaif");
		girlInformationEntity.setLocation("Navi Mumbai");
		girlInformationEntity.setEducation("MBA");
		girlInformationEntity.setAge(28);
		girlInformationEntity.setHeight(5.7);
		girlInformationEntity.setWeight(55.5);
		
		System.out.println("Enity :" +girlInformationEntity);

		GirlInformationRepositoryImpl repository = new GirlInformationRepositoryImpl();
		
		GirlInformationServicesImpl services = new GirlInformationServicesImpl(repository);
		
			//services.onValidateAndSave(girlInformationEntity);
			
			services.findById(2);
		
			services.findAll();
			
			services.update(null, 0)
	}

}

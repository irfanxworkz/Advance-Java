package com.xworkz.electricity.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricity.dto.PoliceStationDTO;

public class PoliceStationRepositoryImpl implements PoliceStationRepository {

	Collection<PoliceStationDTO> dtos = new ArrayList<>();
	
	@Override
	public boolean save(PoliceStationDTO dto) {
		
		System.out.println("Running save:" + dto);
		
		return this.dtos.add(dto);
	}

}

package com.xworkz.electricity.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricity.dto.AmbulanceDTO;

public class AmbulanceRepositoryImpl implements AmbulanceRepository {

	private Collection<AmbulanceDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(AmbulanceDTO dto) {
		
		System.out.println("Running save:" + dto);
		
		return this.dtos.add(dto);
	}

}

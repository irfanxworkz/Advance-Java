package com.xworkz.electricity.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricity.dto.MarriageDTO;

public class MarriageRepositoryImpl implements MarriageRepository {

	Collection<MarriageDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(MarriageDTO dto) {
		
		System.out.println("Running save:" + dto);

		return this.dtos.add(dto);
	}

}

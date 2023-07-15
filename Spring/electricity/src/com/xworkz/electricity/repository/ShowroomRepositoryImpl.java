package com.xworkz.electricity.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricity.dto.ShowroomDTO;

public class ShowroomRepositoryImpl implements ShowroomRepository {
	   
	Collection<ShowroomDTO> dtos=new ArrayList<>();
	
	@Override
	public boolean save(ShowroomDTO dto) {
		
		System.out.println("Running save:" + dto);
	
			return this.dtos.add(dto);
		
	
	}

}

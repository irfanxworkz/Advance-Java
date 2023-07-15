package com.xworkz.showroom.repositry;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.DTO.ShowroomDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ShowroomRepositryImpl implements ShowroomRepositry{
	
	private Collection<ShowroomDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(ShowroomDTO dto) {
		
			System.out.println("Running save:"+dto);
		
		return this.dtos.add(dto);
	}

}

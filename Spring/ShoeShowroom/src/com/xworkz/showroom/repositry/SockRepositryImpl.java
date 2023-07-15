package com.xworkz.showroom.repositry;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.DTO.SockDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SockRepositryImpl implements SockRepositry {

	private Collection<SockDTO> dtos =new ArrayList<>();
	
	@Override
	public boolean save(SockDTO dto) {
		System.out.println("running save methods: "+dto);
		return this.dtos.add(dto);
	}

}

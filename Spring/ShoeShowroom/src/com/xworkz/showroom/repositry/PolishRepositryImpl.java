package com.xworkz.showroom.repositry;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.DTO.PolishDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PolishRepositryImpl implements PolishRepositry {

	private Collection<PolishDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(PolishDTO dto) {
		System.out.println("Running Save methods: " + dto);
		return this.dtos.add(dto);
	}

}

package com.xworkz.showroom.repositry;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.DTO.SalesManagerDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalesManagerRepositryImpl implements SalesManagerRepositry {

	private Collection<SalesManagerDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(SalesManagerDTO dto) {
		System.out.println("running save :" + dto);
		return this.dtos.add(dto);
	}

}

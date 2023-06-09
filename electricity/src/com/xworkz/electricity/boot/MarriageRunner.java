package com.xworkz.electricity.boot;

import java.time.LocalDate;

import com.xworkz.electricity.dto.MarriageDTO;
import com.xworkz.electricity.repository.MarriageRepository;
import com.xworkz.electricity.repository.MarriageRepositoryImpl;
import com.xworkz.electricity.service.MarriageService;
import com.xworkz.electricity.service.MarriageServiceImpl;

public class MarriageRunner {

	public static void main(String[] args) {
		MarriageDTO dto = new  MarriageDTO(5, "Shivani", "Rahul", false, LocalDate.of(2023, 05, 12), "Haiven", 89, false);
		
		MarriageRepository marriageRepository = new MarriageRepositoryImpl();

		MarriageService marriageService = new MarriageServiceImpl(marriageRepository);
		boolean save = marriageService.validateAndThenSave(dto);
		System.out.println(save);

	}

}

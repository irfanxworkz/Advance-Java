package com.xworkz.electricity.boot;

import java.time.LocalDate;

import com.xworkz.electricity.dto.AmbulanceDTO;
import com.xworkz.electricity.repository.AmbulanceRepository;
import com.xworkz.electricity.repository.AmbulanceRepositoryImpl;
import com.xworkz.electricity.service.AmbulanceService;
import com.xworkz.electricity.service.AmbulanceServiceImpl;

public class AmbulanceRunner {

	public static void main(String[] args) {
		AmbulanceDTO dto = new AmbulanceDTO(22, 1354, 154786l, "Kamal", LocalDate.of(2022, 8, 21), "Shaan",
				LocalDate.of(2024, 2, 16));

		AmbulanceRepository ambulanceRepository = new AmbulanceRepositoryImpl();

		AmbulanceService ambulanceService = new AmbulanceServiceImpl(ambulanceRepository);
		boolean save = ambulanceService.save(dto);
		System.out.println(save);

	}

}


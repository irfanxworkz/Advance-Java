package com.xworkz.electricity.boot;

import java.time.LocalDate;

import com.xworkz.electricity.constant.ShowroomLocation;
import com.xworkz.electricity.dto.ShowroomDTO;
import com.xworkz.electricity.repository.ShowroomRepository;
import com.xworkz.electricity.repository.ShowroomRepositoryImpl;
import com.xworkz.electricity.service.ShowroomService;
import com.xworkz.electricity.service.ShowroomServiceImpl;

public class ShowroomRunner {

	public static void main(String[] args) {
		ShowroomDTO showroomDTO = new ShowroomDTO(16, "Puma", ShowroomLocation.RAJAJINAGAR, 69587456,
				LocalDate.of(2004, 5, 12), false);
		ShowroomRepository showroomRepository = new ShowroomRepositoryImpl();
		ShowroomService showroomService = new ShowroomServiceImpl(showroomRepository);
		boolean saved = showroomService.validateAndThanSave(showroomDTO);
		System.out.println(saved);

	}

}
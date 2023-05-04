package com.xworkz.showroom.repositry;

import com.xworkz.electricity.dto.ShowroomDTO;

public interface ShowroomRepository {
	
    boolean save(ShowroomDTO dto);
}
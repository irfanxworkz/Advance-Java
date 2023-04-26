package com.xworkz.electricity.repository;

import com.xworkz.electricity.dto.ShowroomDTO;

public interface ShowroomRepository {
    boolean save(ShowroomDTO dto);
}
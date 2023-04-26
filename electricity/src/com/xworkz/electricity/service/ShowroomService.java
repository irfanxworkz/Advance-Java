package com.xworkz.electricity.service;

import com.xworkz.electricity.dto.ShowroomDTO;

public interface ShowroomService {
    boolean validateAndThanSave(ShowroomDTO dto);
}
package com.xworkz.donation.services;

import com.xworkz.donation.dto.BloodDonationDTO;

public interface DonationService {

	boolean validateAndSave(BloodDonationDTO dto);
}

package com.xworkz.donation.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xworkz.donation.dto.BloodDonationDTO;
import com.xworkz.donation.entity.DonationEntity;

@Service
public class DonationServiceImpl implements DonationService {

	public DonationServiceImpl() {
		System.out.println("Creating no-arg constructor using DonationServiceImpl!!!");
	}
	
	@Override
	public boolean validateAndSave(BloodDonationDTO dto) {
		System.out.println("Running validateAndSave Method in DonationServiceImpl..."+dto);
		DonationEntity donationEntity = new DonationEntity();
		BeanUtils.copyProperties(dto, donationEntity);
		System.out.println("Entity after copy.."+donationEntity);
		
		return true;
	}

}

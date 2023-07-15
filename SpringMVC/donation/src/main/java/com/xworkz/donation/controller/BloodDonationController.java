package com.xworkz.donation.controller;

import java.io.File;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.donation.constants.DonationConstants;
import com.xworkz.donation.dto.BloodDonationDTO;
import com.xworkz.donation.services.DonationService;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")
@Slf4j
public class BloodDonationController {

	private List<BloodDonationDTO> bloodDonationDTOs = new ArrayList<>();
	
	private DonationService donationService;
	
	public BloodDonationController() {
		log.info("Creating no-arg constructor using BloodDonationController!!!");
	}

	@PostMapping(value = "/donate")
	private String clickOnDonate(@Valid BloodDonationDTO dto, BindingResult bindingResult, Model model,
			MultipartFile file) throws IOException {
		log.info("Running clickOnDonate method in BloodDonationController..." + dto);

		model.addAttribute("dtos", dto);
		if (bindingResult.hasErrors()) {
			model.addAttribute("errors", bindingResult.getAllErrors());
			model.addAttribute("dto", dto);
			return "/BloodDonationForm.jsp";
		} else {
			log.info("File received: "+file.getName());
			log.info("File Name: "+file.getOriginalFilename());
			log.info("File Size: "+file.getSize());
			log.info("File Type: "+file.getContentType());
			log.info("File bytes: "+file.getBytes());
			
			dto.setFileName(System.currentTimeMillis()+" _"+file.getOriginalFilename());
			dto.setContentType(file.getContentType());
			dto.setFileSize(file.getSize());
			
			File physicalFile = new File(DonationConstants.FILE_LOCATION + dto.getFileName());

			try (OutputStream os = new FileOutputStream(physicalFile)) {
				os.write(file.getBytes());
			}
			
			bloodDonationDTOs.add(dto);
			donationService.validateAndSave(dto);
			
			log.info("Dto to added to list, with total "+bloodDonationDTOs.size());
			model.addAttribute("msg1", "Blood Donation of " + dto.getPName() + " is submitted successfully");
			
			/*
			 * System.out.println("Blood Donation data is valid"); model.addAttribute("msg",
			 * "Blood donation "+dto.getPName()+ "Data save successfully...");
			 * model.addAttribute("dto", dto); model.addAttribute("PersonName",
			 * dto.getPName()); model.addAttribute("BloodGroup", dto.getGroup());
			 * model.addAttribute("Age", dto.getAge()); model.addAttribute("Contact",
			 * dto.getContact()); model.addAttribute("Weight", dto.getWeight());
			 * model.addAttribute("DonationDate", dto.getDonationDate());
			 * model.addAttribute("Address", dto.getAddress());
			 * this.bloodDonationDTOs.add(dto);
			 */
		}

		return "/Display.jsp";

	}
}

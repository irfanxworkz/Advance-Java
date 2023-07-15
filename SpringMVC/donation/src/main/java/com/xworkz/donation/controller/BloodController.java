package com.xworkz.donation.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.donation.dto.BloodDonationDTO;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")

public class BloodController {

	public BloodController() {
		System.out.println("creating no-arg Constructor using BloodController!!!");
	}

	@RequestMapping("/save")
	private String onSave(Model model) {
		model.addAttribute("dto", new BloodDonationDTO());
		System.out.println("running onSave Method for default page...");
		return "/BloodDonationForm.jsp";

	}
}

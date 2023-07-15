package com.xworkz.client.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.client.dto.ContactApplicationDTO;

@Component
@RequestMapping("/")
public class ContactApplicationController {

	private List<ContactApplicationDTO> dtos = new ArrayList<>();
	
	public ContactApplicationController() {
		System.out.println("creating no-arg constructor using ContactApplicationController!!!");
	}
	
	@RequestMapping(value =  "/contact")
	private String applicationDetails(ContactApplicationDTO dto, Model model) {
		System.out.println("Executing applicationDetails method...");
		model.addAttribute("msg",dto.getName()+" Details Saved Successfully");
		model.addAttribute("name", dto.getName());
		model.addAttribute("email", dto.getEmail() );
		model.addAttribute("country", dto.getCountry() );
		model.addAttribute("mobile", dto.getMobile());
		model.addAttribute("type", dto.getType());
		model.addAttribute("desc", dto.getDesc());
		dtos.add(dto);
		
		return ("/Details.jsp");
		
	}
	
	@RequestMapping(value = "/view")
	private String contactView(Model model) {
		
		System.out.println("Executing contactView Method ...");
		model.addAttribute("msg", "This page is under construction using JSTL");
		model.addAttribute("list", dtos);
		
		return ("/ContactView.jsp");

	}
}

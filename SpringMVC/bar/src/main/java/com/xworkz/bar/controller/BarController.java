package com.xworkz.bar.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bar.dto.BarDTO;

@Component
@RequestMapping("/")
public class BarController {
	
	private List<BarDTO> barDTOs = new ArrayList<>();

	@PostMapping(value = "/save")
	private String onClickSave(@Valid BarDTO dto,BindingResult  bindingResult,Model model) {
		System.out.println("Executing onClickSave method...in BarController"+dto);
		
		
		if(bindingResult.hasErrors()) {
			System.out.println("Bar data is inValid");
		
			model.addAttribute("errorMsg", bindingResult.getAllErrors());
			
			return "Landing.jsp";
		}
		
		model.addAttribute("msg",dto.getBarName()+" Details Saved Successfully");
		model.addAttribute("BarName", dto.getBarName());
		model.addAttribute("BarLicence", dto.getLicenceNo());
		model.addAttribute("BarType", dto.getBarType());
		model.addAttribute("BarLocation", dto.getLocation());
		model.addAttribute("BarStaff", dto.getTotalStaff());
		model.addAttribute("BarStock", dto.getStock());
		model.addAttribute("BarAlcohol", dto.getAlcohol());
		model.addAttribute("BarStatus", dto.getStatus());
		model.addAttribute("BarStaff", dto.getGender());
		model.addAttribute("BarFeedback", dto.getFeedback());
		barDTOs.add(dto);
		return ("/Display.jsp");
	
	}
	
	@PostMapping(value = "/view")
	private String onClickView(Model model) {
		System.out.println("Executing onClickView Method ...in BarController"+barDTOs);
		model.addAttribute("msg", "This page is under construction using JSTL");
		model.addAttribute("list", barDTOs);
		return ("/ViewDetails.jsp");
		

	}
}

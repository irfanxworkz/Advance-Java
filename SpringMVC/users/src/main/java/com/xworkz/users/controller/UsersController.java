package com.xworkz.users.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.users.dto.UserDTO;

@Component
@RequestMapping("/")
public class UsersController {

	public UsersController() {
		System.out.println("Created UsersController");
	}
	
	@RequestMapping(value="/click")
	public String method(UserDTO dto, Model model) {
		model.addAttribute("msg", "Registration sucessfull for "+dto.getName());
		return "/index.jsp";
	}
}

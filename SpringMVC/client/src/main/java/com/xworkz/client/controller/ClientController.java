package com.xworkz.client.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.client.dto.ClientDTO;

@Component
@RequestMapping("/")

public class ClientController {

	
	/*public ClientController() {
		System.out.println("creating no-arg ClientController");
	}
	
	@RequestMapping(value = "/info")
	private String clientLogin(ClientDTO dto, Model model) {
		System.out.println("running clientLogin method..."+dto);
		model.addAttribute("msg1", "Client login successfully");
		model.addAttribute("User", dto.getUserName());
		model.addAttribute("Pass", dto.getPassword());
		return ("/display.jsp");

	}

*/
}

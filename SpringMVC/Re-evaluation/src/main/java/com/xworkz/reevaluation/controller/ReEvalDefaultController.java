package com.xworkz.reevaluation.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.reevaluation.dto.ReEvaluationDTO;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")
@Slf4j
public class ReEvalDefaultController {

	@RequestMapping(value = "/onStart")
	private String onStart(Model model) {
		model.addAttribute("dto", new ReEvaluationDTO());
		log.info("Running onStart method in ReEvalDefaultController...");
		return "Evaluation.jsp";
	}
	
}

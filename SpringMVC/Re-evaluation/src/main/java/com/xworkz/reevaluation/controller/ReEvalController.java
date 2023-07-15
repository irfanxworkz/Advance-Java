package com.xworkz.reevaluation.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.reevaluation.constants.ApplicationConstant;
import com.xworkz.reevaluation.dto.ReEvaluationDTO;
import com.xworkz.reevaluation.services.ReEvaluationServices;
import com.xworkz.reevaluation.services.ReEvaluationServicesImpl;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")
@Slf4j
public class ReEvalController {

	private Set<ReEvaluationDTO> dtos = new TreeSet<>();
	
	@Autowired
	private ReEvaluationServices evaluationServicesImpl;
	
	public ReEvalController() {
		log.info("creating no-arg constructor using ReEvalController!!!"+this.getClass().getSimpleName());	
	}
	
	@PostMapping("/sub")
	private String onSubmit(@Valid ReEvaluationDTO dto, BindingResult bindingResult, Model model,MultipartFile file) 
			throws IOException {
		log.info("Running onSubmit method in ReEvalController");
		
		model.addAttribute("dtos", dto);
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("errors", bindingResult.getAllErrors());
			model.addAttribute("dto", dto);
			return "/Evaluation.jsp";
			
		} else {
			log.info("File received: "+file.getName());
			log.info("File Name: "+file.getOriginalFilename());
			log.info("File Size: "+file.getSize());
			log.info("File Type: "+file.getContentType());
			log.info("File bytes: "+file.getBytes());

			evaluationServicesImpl.validateAndSave(dto);
			
			dto.setFileName(System.currentTimeMillis()+" _"+file.getOriginalFilename());
			dto.setContentType(file.getContentType());
			dto.setFileSize(file.getSize());
			
			File physicalFile = new File(ApplicationConstant.FILE_LOCATION + dto.getFileName());
			
			try (OutputStream os = new FileOutputStream(physicalFile)) {
				os.write(file.getBytes());
			}
			
			this.dtos.add(dto);
			log.info("Dto added to set, with total"+ this.dtos.size());
			model.addAttribute("msg", " Application of " + dto.getStudentName() + " for re-evaluation is submitted successfully");
		}
		
		return "/Details.jsp";
		
	}
	
	@GetMapping("/fileDownload")
	public void sendImage(String fileName, String contentType, HttpServletResponse response) throws IOException {
		log.info("running sendImage method...");
		
		File file = new File(ApplicationConstant.FILE_LOCATION + fileName);
		
		response.setContentType(contentType);
		
		OutputStream outputStream = response.getOutputStream();
		FileInputStream in = new FileInputStream(file);
		byte[] buffer = new byte[4096];
		int length;
		while((length = in.read(buffer)) > 0) {
			outputStream.write(buffer, 0, length);
		}
		in.close();
		outputStream.flush();
	}
	
	@GetMapping("/list")
	public String showData(Model model) {
		log.info("running showData method...");
		model.addAttribute("dtos", this.dtos);
		return "/Display.jsp";
	}
}

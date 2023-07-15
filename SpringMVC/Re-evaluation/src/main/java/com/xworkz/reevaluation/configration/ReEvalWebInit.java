package com.xworkz.reevaluation.configration;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.reevaluation.constants.ApplicationConstant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReEvalWebInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	public ReEvalWebInit() {
		log.info("Creating no-arg constructor using ReEvalWebInit!!!");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("Running getRootConfigClasses method in ReEvalWebInit...");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("Running getServletConfigClasses method in ReEvalWebInit...");
		return new Class[] {ReEvaluationConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		log.info("Running getServletMappings method in ReEvalWebInit...");
		return new String[] {"/"};
	}
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize = ApplicationConstant.MAX_FILE_SIZE;
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(ApplicationConstant.TEMP_FILE_LOCATION, maxSize, maxSize *2, maxSize /2);
		registration.setMultipartConfig(multipartConfigElement);
	}
}

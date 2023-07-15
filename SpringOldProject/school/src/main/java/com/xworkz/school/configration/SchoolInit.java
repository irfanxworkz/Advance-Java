package com.xworkz.school.configration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SchoolInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	public SchoolInit() {
		System.out.println("Creating no-arg constructor using SchoolInit!!!");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses in SchoolInit...");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses in SchoolInit...");
		return new Class[] {SchoolConfigration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings in SchoolInit...");
		return new String[] {"/"};
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}

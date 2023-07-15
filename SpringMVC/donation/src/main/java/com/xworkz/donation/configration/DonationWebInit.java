package com.xworkz.donation.configration;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DonationWebInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	public DonationWebInit() {
		System.out.println("Creating no-arg Constructor Using DonationWebInit!!!");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses method");
		return new Class[] {DonationConfigration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings method");
		return new String[] {"/"};
	}
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize = 800000000;
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement("C:\\Users\\irfan khan\\OneDrive\\Desktop\\x-workz\\tomcat-file\\temp", maxSize, maxSize * 2, maxSize / 2);
		registration.setMultipartConfig(multipartConfigElement);
	}

}

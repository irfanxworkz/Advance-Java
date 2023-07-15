package com.xworkz.client.configration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class ContactApplicationInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	public ContactApplicationInit() {
		System.out.println("Creating no-arg Constructor Using ContactApplicationInit!!!");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses method using ContactApplicationInit class");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses method using ContactApplicationInit class");
		return new Class[] {ContactApplicationConfigration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings method using ContactApplicationInit class");
		return new String[] {"/"};
	}

}

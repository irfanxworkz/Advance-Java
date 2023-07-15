package com.xworkz.bar.configration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BarInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	public BarInit() {
		System.out.println("Creating no-arg constructor using BarInit ...");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses method using BarInit class");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses method using BarInit class");
		return new Class[] {BarConfigration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings method using BarInit class");
		return new String[] {"/"};
	}

}

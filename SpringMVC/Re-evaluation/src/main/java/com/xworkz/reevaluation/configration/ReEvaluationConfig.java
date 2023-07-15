package com.xworkz.reevaluation.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan("com.xworkz.reevaluation")
@EnableWebMvc
@Slf4j
public class ReEvaluationConfig implements WebMvcConfigurer{

	public ReEvaluationConfig() {
		log.info("Creating no-arg Constructor Using ReEvaluationConfig!!!"+this.getClass().getSimpleName());
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		log.info("running configureDefaultServletHandling");
		configurer.enable();
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		log.info("running addViewControllers");
		registry.addViewController("/").setViewName("onStart");
	}
	
	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}
}

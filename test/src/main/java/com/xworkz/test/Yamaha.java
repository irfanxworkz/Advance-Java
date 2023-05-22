package com.xworkz.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 9,urlPatterns = "/yamaha")
public class Yamaha extends HttpServlet{
	
	public Yamaha() {
		System.out.println("Creating no-arg constructor using Yamaha !!!");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet method running in Yamaha...");
		//super.doGet(req, resp);
	}


}

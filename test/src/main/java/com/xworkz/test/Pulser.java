package com.xworkz.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 6,urlPatterns = "/pulser")
public class Pulser extends HttpServlet{
	
	public Pulser() {
		System.out.println("Creating no-arg constructor using Pulser !!!");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet method running in Pulser...");
		//super.doGet(req, resp);
	}

}

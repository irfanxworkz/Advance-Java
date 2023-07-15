package com.xworkz.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 10,urlPatterns = "/yellow")
public class Yellow extends HttpServlet{
	
	public Yellow() {
		System.out.println("Creating no-arg constructor using Yellow !!!");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet method running in Yellow...");
		//super.doGet(req, resp);
	}


}

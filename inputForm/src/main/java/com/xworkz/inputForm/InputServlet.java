package com.xworkz.inputForm;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/info")
public class InputServlet extends HttpServlet{
	
	public InputServlet() {
		System.out.println("creating no-arg constructor Using InputServlet!!!");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Executing Dopost methods from InputServlet...");
	
	RequestDispatcher dispatcher =	req.getRequestDispatcher("/display.jsp");
	dispatcher.forward(req, resp);//servlet to jsp
	}

}

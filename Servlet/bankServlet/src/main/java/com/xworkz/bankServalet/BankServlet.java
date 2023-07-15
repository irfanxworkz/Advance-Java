package com.xworkz.bankServalet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(loadOnStartup = 1, urlPatterns = "/bank")
public class BankServlet extends HttpServlet{
	
	public BankServlet() {
		System.out.println("Creating no-arg constructor using BankServlet!!!");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("Executing Dopost Method from BankServlet...");
		
		System.out.println("Ip of " + req.getParameter("fName")+req.getRemoteAddr());
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for (Cookie cookie1 : cookies) {
				System.out.println(cookie1.getName()+" "+cookie1.getValue());
			}
		}

		req.setAttribute("fName", req.getParameter("fName"));
		req.setAttribute("lName", req.getParameter("lName"));
		req.setAttribute("acNo", req.getParameter("acNo"));
		req.setAttribute("pass1", req.getParameter("pass1"));
		req.setAttribute("pass2", req.getParameter("pass2"));
		
		req.setAttribute("from", req.getParameter("sender"));
		req.setAttribute("to", req.getParameter("receiver"));
		req.setAttribute("amount", req.getParameter("amount"));
		
		HttpSession session = req.getSession();
		session.setAttribute("name", req.getParameter("fName"));
	
		ServletContext context = req.getServletContext();
		context.setAttribute("Company", "Google");
		
		RequestDispatcher dispatcher1 = req.getRequestDispatcher("/display.jsp");
		dispatcher1.forward(req, resp);
		RequestDispatcher dispatcher2 = req.getRequestDispatcher("/transfer.jsp");
		dispatcher2.forward(req, resp);
		RequestDispatcher dispatcher3 = req.getRequestDispatcher("/amount.jsp");
		dispatcher3.forward(req, resp);
	
		
	}
}

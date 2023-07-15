package com.xworkz.foodShop;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/fav")
public class FoodServlet extends HttpServlet{
	
	public FoodServlet() {
		System.out.println("Creating no-arg constructor Using FoodServlet!!!");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("Executing DoPost method from FoodServlet...");
		
		req.setAttribute("fFood", req.getParameter("fFood"));
		req.setAttribute("fPlace", req.getParameter("fPlace"));
		req.setAttribute("fPerson", req.getParameter("fPerson"));
		
		String[] laptop= {"HP","ACER","DELL"};
		req.setAttribute("laptop1", laptop[0]);
		req.setAttribute("laptop2", laptop[1]);
		req.setAttribute("laptop3", laptop[2]);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/InfoDisplay.jsp");
		dispatcher.forward(req, resp);
	}

}

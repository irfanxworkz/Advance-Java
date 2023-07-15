package com.xworkz.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/blue")
public class Blue extends HttpServlet{
	
	public Blue() {
		System.out.println("Creating no-arg constructor using Blue!!!");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("doGet method running in Blue...");
		
		System.out.println(req.getRequestURI());
		Enumeration<String> enumeration=req.getHeaderNames();
		while(enumeration.hasMoreElements()) {
			String headerName = enumeration.nextElement();
			
			System.out.println(headerName + " : " +req.getHeader(headerName));
		}
		
		System.out.println("-----------------------------------------------------------");
		
		resp.setContentType("text/html");//MIME TYPE
		
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.print("<html><body><h1>This is my first responce....</h1></body></html>");
	}


}

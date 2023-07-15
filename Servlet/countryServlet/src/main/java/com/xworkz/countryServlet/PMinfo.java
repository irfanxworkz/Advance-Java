package com.xworkz.countryServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/pm")
public class PMinfo extends HttpServlet{
	
	public PMinfo() {
		System.out.println("creating no-arg Constructor Using PMinfo!!!");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Executing Doget method in PMinfo...");
		
		String pmName = req.getParameter("pmName");
		
		System.out.println(pmName);
		
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html>");
		printWriter.print("<head>");
		printWriter.print("<title>");
		printWriter.print("CountryDynamicPage");
		printWriter.print("</title>");
		printWriter.print("<link href=\"Sample.css\" rel=\"stylesheet\" type=\"text/css\" >");
		printWriter.print("</head>");
		printWriter.print("<body style='background-color:#d3d3d3;'>");
		
		printWriter.print("<h1>PM Info</h1>");
		printWriter.print("<a>");
		printWriter.print("Prime Minister Name: = "+ pmName);
		printWriter.print("</a>");
		printWriter.print("<br><br><br>");
		printWriter.print("<a href=\"index.html\"><input type=\"submit\" value=\"Goto Index\"></a><br>");
		printWriter.print("</body>");
		printWriter.print("</html>");
		
	}
	

}

package com.xworkz.countryServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/country")
public class CountryServlet extends HttpServlet{
	
	public CountryServlet() {
		System.out.println("creating no-arg constructor using CountryServlet!!!");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Executing Doget method in CountryServlet...");
		
		String cName = req.getParameter("cName");
		String cCode = req.getParameter("cCode");
		String cCapitalCity = req.getParameter("cCapitalCity");
		String cPopulation = req.getParameter("cPopulation");
		
		System.out.println(cName+" "+cCode+" "+cCapitalCity+" "+cPopulation);
		
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
		printWriter.print("<form method=\"get\" action=\"pm\">");
		printWriter.print("<h1>");
		printWriter.print("country info Page");
		printWriter.print("</h1>");
		printWriter.print("<a>");
		printWriter.print("Country Name: = "+ cName);
		printWriter.print("<br> Country Code: = "+ cCode);
		printWriter.print("<br> Country CapitalCity: = "+ cCapitalCity);
		printWriter.print("<br> Country Population: = "+ cPopulation);
		printWriter.print("</a>");
		printWriter.print("<br><br><br>");
		printWriter.print("<pr>");
		printWriter.print("<h1>Enter Prime Minister Name</h1>");
		printWriter.print("Pm Name <input type=\"text\" name=\"pmName\"><br>");
		printWriter.print("&emsp;&emsp;&emsp;&emsp;&nbsp;");
		printWriter.print("<input type=\"submit\" value=\"Send PM\">");
		printWriter.print("</pr>");
		printWriter.print("</form>");
		printWriter.print("</body>");
		printWriter.print("</html>");
	}
}


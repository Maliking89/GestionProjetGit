package fr.video2brain.tempconverter.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("LoginServlet - doGet");
		//PrintWriter out = resp.getWriter();
		//out.println("<html> <head> </head><body><h1>Hello World !!</h1></body></html>");
		req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("LoginServlet - poGet");
	}
	

	
	/*protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {
System.out.println("loginServlet - Service Methode");}*/
	
	
	
}

package com.demoLocale;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoLocale")
public class DemoLocale extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
			
		String[] languageAndCountry =  request.getParameter("language").split("_");
		String language = languageAndCountry[0];
		String country = languageAndCountry[1];
		
		Locale locale = new Locale(language,country);
		
		ResourceBundle bundle = ResourceBundle.getBundle("resource.content",locale);  
		request.setAttribute("message", bundle.getString("hello"));
		RequestDispatcher requestdispatcher = request.getRequestDispatcher("FirstDemo.jsp");
		requestdispatcher.forward(request, response);
	}
}

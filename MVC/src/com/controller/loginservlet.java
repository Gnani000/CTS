package com.controller;
import java.io.*; 
import javax.servlet.*;
import javax.servlet.http.*;
import com.model.login;

public class loginservlet extends HttpServlet {	
    String user,pass;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		user=request.getParameter("user");
		pass=request.getParameter("pass");
		login l =new login();
		l.setUsername(user);
		l.setPassword(pass);
		request.setAttribute("Model",l);
		boolean status=l.validate();
		if(status)
			request.getRequestDispatcher("sucess.jsp").forward(request, response);
		else
			request.getRequestDispatcher("error.jsp").forward(request, response);
	}

}

package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 // Handle POST requests for login
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String aName = request.getParameter("uid");
		String aPass = request.getParameter("pass");
		
		//Exception
		try {
			List<administrator> adDetails = adminDBUtil.validate(aName, aPass);
			request.setAttribute("adDetails", adDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Forward the request to the adminaccount.jsp page
		RequestDispatcher dis = request.getRequestDispatcher("adminaccount.jsp");
		dis.forward(request, response);
	}

}

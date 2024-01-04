package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateAdminServlet")
public class UpdateAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Handle POST requests for updating admin account information
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String firstname = request.getParameter("fname");
		String lastname = request.getParameter("lname");
		String Username = request.getParameter("uname");
		String Email = request.getParameter("email");
		String Password = request.getParameter("password");
		String phoneno = request.getParameter("phoneno");

		boolean isTrue;
		// Update admin account information using adminDBUtil
		isTrue = adminDBUtil.updateadmin(id, firstname, lastname, Username, Email, Password, phoneno);

		if (isTrue == true) {

			List<administrator> adDetails = adminDBUtil.getAdminDetails(id);
			request.setAttribute("adDetails", adDetails);
			RequestDispatcher dis = request.getRequestDispatcher("adminaccount.jsp");
			dis.forward(request, response);
		} else {
			List<administrator> adDetails = adminDBUtil.getAdminDetails(id);
			request.setAttribute("adDetails", adDetails);
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}

	}

}

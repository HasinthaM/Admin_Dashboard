package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Deleteadminaccountservlet")
public class Deleteadminaccountservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		boolean isTrue;

		isTrue = adminDBUtil.deleteadminaccount(id);

		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("deletesuccess.jsp");
			dispatcher.forward(request, response);

		} else {
			List<administrator> adDetails = adminDBUtil.getAdminDetails(id);
			request.setAttribute("adDetails", adDetails);

			RequestDispatcher dispatcher = request.getRequestDispatcher("adminaccount.jsp");
			dispatcher.forward(request, response);

		}
	}

}

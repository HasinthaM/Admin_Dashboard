package platformManager;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateManagerServlet")
public class UpdateManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("manid");
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String userName = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		String phone = request.getParameter("phone");	
	
		boolean isTrue;

		isTrue = ManagerDBUtil.UpdateManager(id, firstName, lastName, userName, email, password, phone);

		if (isTrue == true) {

			List<Manager> manDetails = ManagerDBUtil.getManagerDetails(id);
			request.setAttribute("manDetails", manDetails);

			RequestDispatcher dis = request.getRequestDispatcher("ManagerAccount.jsp");
			dis.forward(request, response);
		} else {

			List<Manager> manDetails = ManagerDBUtil.getManagerDetails(id);
			request.setAttribute("manDetails", manDetails);

			RequestDispatcher dis = request.getRequestDispatcher("ManagerAccount.jsp");
			dis.forward(request, response);
		}
	
	}
}
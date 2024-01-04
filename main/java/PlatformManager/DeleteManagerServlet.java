package platformManager;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteManagerServlet")
public class DeleteManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("manid");

		boolean isTrue;
		
		isTrue = ManagerDBUtil.DeleteManager(id);
		
		if (isTrue == true) {

			RequestDispatcher dis = request.getRequestDispatcher("LogIn.jsp");
			dis.forward(request, response);
			
		} else {

			List<Manager> manDetails = ManagerDBUtil.getManagerDetails(id);
			request.setAttribute("manDetails", manDetails);

			RequestDispatcher dis = request.getRequestDispatcher("ManagerAccount.jsp");
			dis.forward(request, response);
		}
	}
}
package platformManager;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String mName = request.getParameter("uid");
		String mPass = request.getParameter("pass");
		boolean isTrue;
		
		isTrue = ManagerDBUtil.validate(mName, mPass);
		
		if(isTrue == true) {
			
			List<Manager> manDetails = ManagerDBUtil.getManager(mName);
			request.setAttribute("manDetails", manDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("ManagerAccount.jsp");
			dis.forward(request, response);
			
		}else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Your user name or password is incorrect!!!  : (');");
			out.println("location='LogIn.jsp'");
			out.println("</script>");
			
		}
	}
}
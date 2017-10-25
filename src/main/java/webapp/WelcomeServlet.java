package webapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AuthenticationService;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = (String) request.getParameter("username"); // "username" should match with login.jsp input name
		String password = (String) request.getParameter("password");
		
		boolean isValid = AuthenticationService.isValidUser(username, password);
		if (isValid) {
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		} else {
			response.sendRedirect("/login"); // redirect to /login url
		}
	}
}

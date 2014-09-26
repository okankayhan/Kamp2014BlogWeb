package tr.org.linux.kamp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tr.org.linux.kamp.service.UserService;

@WebServlet("/login")
public class LoginController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String username = (String) req.getParameter("username");
		String password = (String) req.getParameter("password");

		UserService userService = new UserService();
		boolean isAuthenticated = userService.checkAuthentication(username,
				password);

		HttpSession session = req.getSession();
		if (isAuthenticated) {
			session.setAttribute("isLoggedin", true);
			req.setAttribute("message", "Login successful");
			req.getRequestDispatcher("/home").forward(req, resp);
		}
		else{
			session.setAttribute("isLoggedin", false);
			req.setAttribute("message", "Wrong credentials");
			req.getRequestDispatcher("/home").forward(req, resp);
		}
	}
}

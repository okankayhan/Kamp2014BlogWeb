package tr.org.linux.kamp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tr.org.linux.kamp.model.User;
import tr.org.linux.kamp.service.UserService;

@WebServlet("/register")
public class RegisterController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String address = req.getParameter("address");
		
		User user = new User(null, username, password, address);
		
		UserService userService = new UserService();
		userService.save(user);
		
		req.setAttribute("message", "User created");
		req.getRequestDispatcher("/home").forward(req, resp);
	
	}

}

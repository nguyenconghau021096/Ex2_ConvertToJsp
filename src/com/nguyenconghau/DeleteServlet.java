package com.nguyenconghau;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nguyenconghau.jdbc.UserRepository;

@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		UserRepository userRepository = new UserRepository();
		if (username != "" && username != null) {
			userRepository.deleteUser(username);
		}
		
		HttpSession httpSession = req.getSession();
		String usernameSession = httpSession.getAttribute("username").toString();
		if (usernameSession.equals(username)) {
			httpSession.removeAttribute("username");
			resp.sendRedirect("/ServlerExercise/login");
		} else {
			resp.sendRedirect("/ServlerExercise/list-user");
			
		}
	}
}

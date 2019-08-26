package com.nguyenconghau;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nguyenconghau.jdbc.UserRepository;

import JavaBean.UserBean;

public class ChangePassword extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = "";
		HttpSession httpSession = req.getSession();
		
		Object obj = httpSession.getAttribute("username");
		
		if (obj != null) {
			RequestDispatcher dispatchet = req.getRequestDispatcher("/changepass.jsp");
			dispatchet.forward(req, resp);
		} else {
			resp.sendRedirect("/ServlerExercise/login");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println(req.getParameter("password"));
		System.out.println(req.getParameter("newPassword"));
		HttpSession httpSession = req.getSession();
		String username = httpSession.getAttribute("username").toString();
		System.out.println(username);
		String password = req.getParameter("password");
		String newPassword = req.getParameter("newPassword");
		
		UserRepository userRepository = new UserRepository();
		UserBean obj = userRepository.login(username, password);
		if (obj != null) {
			userRepository.changePassword(username, newPassword);
			resp.sendRedirect("/ServlerExercise/login");
		} else {
			doGet(req, resp);
		}
		
	}
}

package com.nguyenconghau;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nguyenconghau.jdbc.UserRepository;

import JavaBean.UserBean;

public class RegisterServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("RegisterServlet được tạo");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatchet = req.getRequestDispatcher("/register.jsp");
		dispatchet.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("username"));
		System.out.println(req.getParameter("password"));
		System.out.println(req.getParameter("email"));
		System.out.println(req.getParameter("gender"));
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		int gender = Integer.parseInt(req.getParameter("gender"));
		
		UserRepository userRepository = new UserRepository();
		userRepository.add(new UserBean(username, email, gender, password));
		
		resp.sendRedirect("/ServlerExercise/login");
		
	}
}

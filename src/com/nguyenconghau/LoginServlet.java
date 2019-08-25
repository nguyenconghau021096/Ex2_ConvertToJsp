package com.nguyenconghau;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("HelloServlet được tạo");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Phương thức của service: "+req.getMethod());
		String url = req.getServerName()+":"+req.getServerPort()+req.getContextPath()+req.getServletPath();
		System.out.println(url);
		
		RequestDispatcher dispatchet = req.getRequestDispatcher("/login.jsp");
		dispatchet.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if (username.equals("nguyenconghau") && password.equals("123456")) {
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("username", username);
			resp.sendRedirect("/ServlerExercise/list-user");
		} else {
			resp.sendRedirect("/ServlerExercise/login");
		}
	}
}

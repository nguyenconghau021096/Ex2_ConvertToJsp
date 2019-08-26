package com.nguyenconghau;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nguyenconghau.jdbc.UserRepository;

import JavaBean.UserBean;

public class ListUserServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("ListUserServlet được tạo");
	}
	
	
	
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		
		req.setCharacterEncoding("utf-8");
		String name = "";
		HttpSession httpSession = req.getSession();		
		Object objName = httpSession.getAttribute("username");
		
		UserRepository userRepository = new UserRepository();
		if (objName != null) {
			name = (String) objName;
			req.setAttribute("listUser", userRepository.getAllUser());
			req.setAttribute("name", name);
			req.setAttribute("WebSiteName",getServletConfig().getInitParameter("WebSiteName"));
			
			RequestDispatcher dispatchet = req.getRequestDispatcher("/list-user.jsp");
			dispatchet.forward(req, resp);
		} else {
			resp.sendRedirect("/ServlerExercise/login");
		}
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String username = req.getParameter("username");
//		String email = req.getParameter("email");
//		int gender = Integer.parseInt(req.getParameter("gender"));
//		String pwd = req.getParameter("pwd");
//		
//		System.out.println(username);
//		System.out.println(email);
//		System.out.println(pwd);
//		System.out.println(gender);
//
//		listUser.add(listUser.size(), (new UserBean(username, email, gender, pwd)));
//		doGet(req, resp);
		
	}
}

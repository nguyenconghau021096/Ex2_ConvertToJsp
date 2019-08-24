package com.nguyenconghau;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JavaBean.UserBean;

public class ListUserServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("ListUserServlet được tạo");
	}
	
	UserBean u1 = new UserBean("Nguyen Van A", "nguyenvana@gmail.com", "Man","A123");
	UserBean u2 = new UserBean("Tran Van B", "tanvanb@gmail.com", "Man","B123");
	UserBean u3 = new UserBean("Le Thi C", "lethic@gmail.com", "WoMan","C123");
	
	
	
	
	ArrayList<UserBean> listUser = new ArrayList<UserBean>(Arrays.asList(u1,u2,u3));
	
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		
		req.setCharacterEncoding("utf-8");
		req.setAttribute("listUser", listUser);
		RequestDispatcher dispatchet = req.getRequestDispatcher("/list-user.jsp");
		dispatchet.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		String gender = req.getParameter("gender");
		
		System.out.println(username);
		System.out.println(email);
		System.out.println(pwd);
		System.out.println(gender);

		listUser.add(listUser.size(), (new UserBean(username, email, gender, pwd)));
		doGet(req, resp);
		
	}
}

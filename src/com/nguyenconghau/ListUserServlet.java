package com.nguyenconghau;

import java.io.IOException;
import java.util.ArrayList;

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
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserBean u1 = new UserBean("Nguyen Van A", "nguyenvana@gmail.com", "Man");
		UserBean u2 = new UserBean("Tran Van B", "tanvanb@gmail.com", "Man");
		UserBean u3 = new UserBean("Le Thi C", "lethic@gmail.com", "WoMan");
		
		ArrayList<UserBean> listUser = new ArrayList<UserBean>();
		listUser.add(u1);
		listUser.add(u2);
		listUser.add(u3);
		
		req.setAttribute("listUser", listUser);
		RequestDispatcher dispatchet = req.getRequestDispatcher("/list-user.jsp");
		dispatchet.forward(req, resp);
	}
}

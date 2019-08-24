package com.nguyenconghau;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf8");
		resp.setContentType("text/html;charset=utf-8");
		
		System.out.println(req.getParameter("username"));
		System.out.println(req.getParameter("pwd"));
		
		
		
		RequestDispatcher rq = req.getRequestDispatcher("/hello.jsp");
		rq.forward(req, resp);
	}
}

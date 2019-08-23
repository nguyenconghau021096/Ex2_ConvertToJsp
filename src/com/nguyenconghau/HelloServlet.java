package com.nguyenconghau;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("HelloServlet được tạo");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Phương thức của service: "+req.getMethod());
		String url = req.getServerName()+":"+req.getServerPort()+req.getContextPath()+req.getServletPath();
		System.out.println(url);
		
		resp.sendRedirect("login.jsp");
	}
}

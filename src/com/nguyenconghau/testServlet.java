package com.nguyenconghau;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet(
//		urlPatterns = {"/test"},
//		initParams = {
//				@WebInitParam(name="name",value="Nguyễn Công Hậu"),
//				@WebInitParam(name="age",value="23"),
//				@WebInitParam(name="gender",value="Man")
//		}
//
//	
//)
public class testServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
//		resp.sendError(404);
		throw new IOException();
//		PrintWriter pw = resp.getWriter();
//		pw.println("<h1>Test Servlet</h1>");
//		pw.println("Tên: "+getServletConfig().getInitParameter("name")
//				+"<br>Tuổi: "+getServletConfig().getInitParameter("age")
//				+"<br>Giới tính: "+getServletConfig().getInitParameter("gender"));
//		pw.println("<br>"+getServletConfig().getServletName());
		
	}
}

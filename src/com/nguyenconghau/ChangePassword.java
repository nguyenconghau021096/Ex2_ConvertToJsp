package com.nguyenconghau;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
}

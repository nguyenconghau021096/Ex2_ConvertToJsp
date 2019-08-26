package com.nguyenconghau;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nguyenconghau.jdbc.UserRepository;

import JavaBean.UserBean;

@WebServlet("/edit")
public class EditServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserRepository userRepository = new UserRepository();
		String username = req.getParameter("username");
		UserBean obj = userRepository.getUser(username);
		req.setAttribute("username", obj.getUsername());
		req.setAttribute("password", obj.getPassword());
		req.setAttribute("gender", obj.getGender());
		req.setAttribute("email", obj.getEmail());
		
		RequestDispatcher rd = req.getRequestDispatcher("/edit.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		int gender =  Integer.parseInt(req.getParameter("gender"));
		String email = req.getParameter("email");
		
		UserRepository userRepository = new UserRepository();
		int ret = userRepository.change(username, password, gender, email);
		System.out.println(ret);
		resp.sendRedirect("/ServlerExercise/list-user");
	}
}

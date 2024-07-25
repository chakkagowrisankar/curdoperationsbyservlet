package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.UserDao;
import dto.User;

@WebServlet("/update1")
public class Update extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String firstname=req.getParameter("fname");
		String lastname=req.getParameter("lname");
		String surName=req.getParameter("surname");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String pho=req.getParameter("phone");
		String ag=req.getParameter("age");
		int age=Integer.parseInt(ag);
		long phone=Long.parseLong(pho);
		String gender=req.getParameter("gender");
		String d=req.getParameter("dob");
		Date dob=Date.valueOf(d);
		UserDao ud =new UserDao();
		try {
			ud.save(new User(firstname, lastname, surName, email, password, gender, age, phone, dob));
			RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
			rd.forward(req, res);
			
		}catch(Exception e) {
//			User u1=ud.find(email);
//			RequestDispatcher rd=req.getRequestDispatcher("update.jsp");
//			req.setAttribute("id", u1.getId());
//			rd.include(req, res);
		}
	}
	
}

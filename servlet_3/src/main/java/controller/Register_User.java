package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.UserDao;
import dto.User;

@WebServlet("/register")
public class  Register_User extends GenericServlet{

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
			RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
			rd.forward(req, res);
			
		}catch(Exception e) {
			RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
			rd.include(req, res);
		}
//		PrintWriter pw=res.getWriter();
//		pw.println(firstname+" "+"registration done successfully .....!!!");
//		pw.println("<html>"
//				+"<head>"
//				+"<style >"
//				+"h1{\r\n"
//				+ "		margin:0;\r\n"
//				+"margin-top:20px"
//				+ "		padding: 0;\r\n"
//				+ "	}"
//				+ "</style>"
//				+"</head>"
//				+"<body>"
//				+"<h1 style='text-align: center;'>"
//				+"Your name is:"+firstname+" "+lastname+" "+surName
//				+"</h1>"
//				+"<h1 style='text-align: center;'>"
//				+"Your Email is:"+email
//				+"</h1>"
//				+"<h1 style='text-align: center;'>"
//				+"Your password is:"+password
//				+"</h1>"
//				+"<h1 style='text-align: center;'>"
//				+"Your phone number is:"+phone
//				+"</h1>"
//				+"<h1 style='text-align: center;'>"
//				+"Your gender is:"+gender
//				+"</h1>"
//				+"<h1 style='text-align: center;'>"
//				+"Your phone number is:"+age
//				+"</h1>"
//				+"<h1 style='text-align: center;'>"
//				+"Your Date of brith is:"+dob
//				+"</h1>"
//				+"</body>"
//				+"</html>");
		
	}

}

package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.UserDao;
import dto.User;
@WebServlet("/login")
public class Login extends GenericServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		UserDao ud=new UserDao();
		try {
			User u=ud.find(email);
			if(u.getPassword().equals(pwd)) {
				List<User> l=ud.allUser();
				req.setAttribute("list", l);
				RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
				rd.forward(req, res);
			}else {
				RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
				rd.include(req, res);
			}
		}catch(Exception e) {
			RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
			rd.include(req, res);
		}
	}

}

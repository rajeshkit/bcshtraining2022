package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String username=req.getParameter("uname");
		String email = req.getParameter("uemail");
		String phone = req.getParameter("uphone");
		String password = req.getParameter("upass");
		String gender = req.getParameter("ugender");
		String[] interest = req.getParameterValues("uinterest");
		String city = req.getParameter("ucity");
		System.out.println("Parameters are:" +username+" "+email);
		System.out.println(phone);
		System.out.println(password);
		System.out.println(gender);
		System.out.println(city);
		for (String i : interest) {
			System.out.println(i);
		}
		PrintWriter pw=res.getWriter();
		pw.write("welcome to registration");
	}

}

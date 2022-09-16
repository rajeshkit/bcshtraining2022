package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		String userEmail=req.getParameter("uemail");
		String userPhone = req.getParameter("uphone");
		String userPass = req.getParameter("upass");
		String userGender = req.getParameter("ugender");
		String userCity = req.getParameter("ucity");
		String[] userInterest = req.getParameterValues("uinterest");
		System.out.println(username);
		System.out.println(userEmail);
		RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
		rd.forward(req, res);
//		PrintWriter pw =res.getWriter();
//		res.setContentType("application/json");
//		pw.write("<html>");
//			pw.write("<head>");
//			pw.write("</head>");
//			pw.write("<body>");
//				pw.write("<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>");
//				pw.write("<h1>Hsbc Pune</h1>");
//			pw.write("</body>");
//		pw.write("</html>");
//		pw.close();
	}

}

package demoservlets.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demoservlets.entity.Student;
import demoservlets.service.StudentService;

@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("user");
		String password = req.getParameter("password");
		// String confirmPassword=req.getParameter("confirmPassword");
		// database logic that create a method in stu.service to fetch according to the
		// given userName and password
		// fetch is it available or not by mapping it by given inputs
		// the query is "select * from student where id=? and name=?"

		StudentService service = new StudentService();
		// Student student=new Student();//not needed
		List<Student> l = service.fetchByPassword(user, password);
		if (!l.isEmpty()) {
//		for(Student s : l) {
//			
//			if(user.equals(s.getStudentName()) && password.equals(s.getPassword())) {
//				RequestDispatcher requestDispatcher=req.getRequestDispatcher("Home.jsp");
//			     requestDispatcher.forward(req, resp);
//				
//			}
//			else {
//
//					//System.out.println("wrong crediatial");
//					RequestDispatcher requestDispatcher=req.getRequestDispatcher("error.jsp");
//					requestDispatcher.forward(req, resp);
//			}
//			}
			RequestDispatcher requestDispatcher1 = req.getRequestDispatcher("Header.jsp");
			requestDispatcher1.include(req, resp);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Home.jsp");
			requestDispatcher.include(req, resp);
			RequestDispatcher requestDispatcher2= req.getRequestDispatcher("Footer.jsp");
			requestDispatcher2.include(req, resp);
			
			

		} else {
			
			PrintWriter pr = resp.getWriter();
			pr.print("<h1 style='color:red'>Invalid Credentials!!!</h1>");
			
			 RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.jsp");
			 requestDispatcher.include(req, resp);
			 
			//resp.sendRedirect("Login.jsp");

		}

	}

}

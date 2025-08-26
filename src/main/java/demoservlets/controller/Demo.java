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

@WebServlet("/register")
public class Demo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("triggerd!!");
		System.out.println("students details!!!!");
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String password = req.getParameter("password");
		String confirmPassword = req.getParameter("confirmPassword");
		System.out.println("Student name: " + name);
		System.out.println("Student id : " + id);
		System.out.println("Student age :" + age);
		StudentService service = new StudentService();
		Student student = new Student();
		student.setStudentName(name);
		student.setStudentId(id);
		student.setStudentAge(age);
		student.setPassword(password);
		student.setConfirmPassword(confirmPassword);
		int res = service.save(student);

		if (res != 0) {
			PrintWriter pr=resp.getWriter();
			pr.print("<h1>"+"Registered Succesfully"+"</h1>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.jsp");
			requestDispatcher.include(req, resp);

		} else {
			PrintWriter pr=resp.getWriter();
			pr.print("<h1 style='color:red'>"+"Registration Failed!!"+"</h1>");
			pr.print("<h1>"+"Register Again"+"</h1>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
			requestDispatcher.include(req, resp);

		}

	}

}

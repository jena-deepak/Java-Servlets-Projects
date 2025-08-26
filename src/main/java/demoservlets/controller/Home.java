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

@WebServlet("/home")
public class Home extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter print = resp.getWriter();
		StudentService service= new StudentService();
		List<Student> l = service.fetchAll();
		if (!l.isEmpty()) {
			RequestDispatcher requestDispatcher1=req.getRequestDispatcher("Header.jsp");
			requestDispatcher1.include(req, resp);
			RequestDispatcher dispatcher=req.getRequestDispatcher("Home.jsp");
			dispatcher.include(req, resp);
						
			print.print(
					"<html><head><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css\""
							+ " rel=\"stylesheet\" integrity=\"sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr\""
							+ " crossorigin=\"anonymous\">"

							+ "</head>" + "<body style='background:linear-gradient(90deg, rgb(14 11 1/ 76%), rgb(16 21 51/ 78%),\r\n"
									+ "		rgb(28 5 59/ 80%), rgb(63 6 20/ 86%))'>" + "<div class='border-dark  mt-5 w-50 ' style='margin-left:25%'>"
							+ "<h1 class='text-center ' style='color: rgb(227 212 231 / 38%) !important;'>REGISTERED STUDENTS</h1><table class='table border-secondary mt-2'>"
							+ "<thead class='fs-4 border-dark  text-center table-primary '>" + "<tr>"
							+ "<th class='border-dark '>Id</th>" + "<th>Student Name</th>"
							+ "<th class='border-dark'> Age</th>" + "</thead>"
							+ "<tbody class='border-secondary  text-center'>");
			for (Student s : l) {
				print.println("<tr class='bg bg-secondary'><td class='border-dark '>" + s.getStudentId() + "</td><td>"
						+ s.getStudentName() + "</td>" + "<td class='border-dark '>" + s.getStudentAge()
						+ "</td></tr>");
			}
			 

		} else {
			print.print("<h1 style='color : red'>" + "Data not Saved");
		}
	
		print.print("</tbody></table></div></body></html>");
		RequestDispatcher requestDispatcher2=req.getRequestDispatcher("Footer.jsp");
		requestDispatcher2.include(req, resp);	
	}
	
	
}

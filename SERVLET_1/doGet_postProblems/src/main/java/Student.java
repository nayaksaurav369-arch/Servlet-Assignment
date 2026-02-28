

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Student
 */
@WebServlet("/StudentServlet")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String name=request.getParameter("name");
			String rollNo=request.getParameter("roll");
			String course=request.getParameter("course");
			response.getWriter().print("Name : "+name+"\n"+"RollNo : "+rollNo+"\n"+"course : "+course);
			
			
	}

}

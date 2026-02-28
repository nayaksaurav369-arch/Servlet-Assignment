

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/employee")
public class regd_form extends HttpServlet {
    
	private static final long serialVersionUID = -5888174835762159600L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<table border='1'>");
        out.println("<tr><th>Name</th><th>Salary</th><th>Department</th></tr>");
        out.println("<tr>");
        out.println("<td>"+req.getParameter("name")+"</td>");
        out.println("<td>"+req.getParameter("salary")+"</td>");
        out.println("<td>"+req.getParameter("dept")+"</td>");
        out.println("</tr></table>");
    }
}

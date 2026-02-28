

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class people extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>Student Details</h2>");
        out.println("Name: " + req.getParameter("name") + "<br>");
        out.println("Age: " + req.getParameter("age") + "<br>");
        out.println("Course: " + req.getParameter("course") + "<br>");
        out.println("Gender: " + req.getParameter("gender"));
    }
}

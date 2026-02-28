import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/validate")
public class Error extends HttpServlet {

	private static final long serialVersionUID = 8948163034300642104L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        String name = req.getParameter("name");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        if (name == null || name.trim().isEmpty()) {
            out.println("<h3 style='color:red;'>Name cannot be empty</h3>");
        } else {
            out.println("<h3>Valid Input: " + name + "</h3>");
        }
    }
}
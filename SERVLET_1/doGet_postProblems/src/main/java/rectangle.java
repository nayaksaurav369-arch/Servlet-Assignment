

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rectangle")
public class rectangle extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        int l = Integer.parseInt(req.getParameter("length"));
        int b = Integer.parseInt(req.getParameter("breadth"));

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Area: " + (l * b) + "</h2>");
    }
}

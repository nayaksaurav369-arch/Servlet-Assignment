

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hobbies")
public class Hobby extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        String[] hobbies = req.getParameterValues("hobby");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h3>Selected Hobbies:</h3>");
        if(hobbies != null) {
            for(String h : hobbies)
                out.println(h + "<br>");
        }
    }
}

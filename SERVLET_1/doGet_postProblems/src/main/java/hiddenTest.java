import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HiddenServlet")
public class hiddenTest extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userId = request.getParameter("userId");
        String name = request.getParameter("name");

        out.println("<html><body>");
        out.println("<h2>Hidden Field Result</h2>");
        out.println("<p>User ID (Hidden): " + userId + "</p>");
        out.println("<p>Name: " + name + "</p>");
        out.println("</body></html>");
    }
}
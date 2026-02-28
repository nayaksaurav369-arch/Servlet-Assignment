import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/convert")
public class TemperatureServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5902069891074691881L;

	protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        double celsius = Double.parseDouble(request.getParameter("celsius"));

        double fahrenheit = (celsius * 9/5) + 32;

        out.println("<h2>Temperature Conversion</h2>");
        out.println("Celsius: " + celsius + "°C<br>");
        out.println("Fahrenheit: " + fahrenheit + "°F");
    }
}
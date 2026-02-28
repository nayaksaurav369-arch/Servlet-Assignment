

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/simple")
public class simple extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int time=Integer.parseInt(request.getParameter("time"));
			int amt=Integer.parseInt(request.getParameter("principal"));
			int rate=Integer.parseInt(request.getParameter("rate"));
			long ans=(amt*time*rate)/100;
			response.getWriter().println("<h1>Interest amount would be : "+ans+" </h1>");
			
			
	
	}

	

}

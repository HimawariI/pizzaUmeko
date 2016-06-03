package servlet;
import java.io.*;
import java.util.*;
 
import javax.jdo.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class KutikomiServlet extends HttpServlet  {
	 private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.sendRedirect("/kutikomi.jsp");
	}
	
}

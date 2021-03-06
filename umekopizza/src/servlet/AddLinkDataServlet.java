package servlet;

import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.text.*;
 
import javax.jdo.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
 
public class AddLinkDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doGet(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("no url...");
    }
    
 
    @Override
    protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        String comment = req.getParameter("review");
        TimeZone.setDefault(TimeZone.getTimeZone("JST"));
        Date cal= Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy年MM月dd日 HH:mm");
        String date = sdf.format(cal.getTime());
        Kutikomi data = new Kutikomi(name,comment,date);
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        try {
            manager.makePersistent(data);
        } finally {
            manager.close();
        }
        resp.sendRedirect("/kutikomi.jsp");
    }
}
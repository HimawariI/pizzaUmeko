package servlet;

import java.io.IOException;
import javax.servlet.http.*;
import javax.jdo.*;
import javax.servlet.ServletException;

public class EditKutikomiServlet extends HttpServlet{
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
        req.setCharacterEncoding("UTF-8");
        long id = Long.parseLong(req.getParameter("id"));
        String name = req.getParameter("name");
        String review = req.getParameter("review");
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        Kutikomi data = (Kutikomi)manager.getObjectById(Kutikomi.class,id);
        data.setUserName(name);
        data.setReview(review);
        manager.close();
        resp.sendRedirect("/kutikomi.jsp");
    }
}

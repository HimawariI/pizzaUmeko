package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.JDOObjectNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyGae extends HttpServlet {
private static final long serialVersionUID = 1L;
  


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
    	PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        request.setCharacterEncoding("utf-8");
        String param1 = request.getParameter("id");
        PrintWriter out = response.getWriter();
        List<Kutikomi> list = null;
        if (param1 == null || param1 ==""){
            String query = "select from " + Kutikomi.class.getName();
            try {
                list = (List<Kutikomi>)manager.newQuery(query).execute();
            } catch(JDOObjectNotFoundException e){}
        } else {
            try {
                Kutikomi data = (Kutikomi)manager.getObjectById(Kutikomi.class,Long.parseLong(param1));
                list = new ArrayList();
                list.add(data);
            } catch(JDOObjectNotFoundException e){}
        }
        String res = "[";
        if (list != null){
            for(Kutikomi data:list){
                res += "{id:" + data.getId() + ",name:'" + data.getUserName() +
                    "',review:'" + data.getReview() + " ',datetime:'" + data.getDatetime() + "'},";
            }
        }
        res += "]";
        out.println(res);
        manager.close();
    }

}

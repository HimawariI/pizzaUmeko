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

public class PizzaGAE extends HttpServlet {
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
        List<Pizza> list = null;
        if (param1 == null || param1 ==""){
            String query = "select from " + Pizza.class.getName();
            try {
                list = (List<Pizza>)manager.newQuery(query).execute();
            } catch(JDOObjectNotFoundException e){}
        } else {
            try {
                Pizza data = (Pizza)manager.getObjectById(Pizza.class,Long.parseLong(param1));
                list = new ArrayList();
                list.add(data);
            } catch(JDOObjectNotFoundException e){}
        }
        String res = "[";
        if (list != null){
            for(Pizza data:list){
                res += /*"{id:" + data.getId() +*/ ",name:'" + data.getUserName() +
                    "',pizza1:'" + data.getPizza1() +",'pizza2:'" + data.getPizza2() +
                    "',pizza3:'" + data.getPizza3() +",'pizza4:'" + data.getPizza4() +
                    "',pizza5:'" + data.getPizza5() +",'pizza6:'" + data.getPizza6() +
                    "',sum:'" + data.getSum() + "'},";
            }
        }
        res += "]";
        out.println(res);
        manager.close();
    }

}

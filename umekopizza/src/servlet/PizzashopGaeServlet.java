package servlet;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@SuppressWarnings("serial")
public class PizzashopGaeServlet extends HttpServlet  {
	 private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("/order.jsp");
	}
	
	
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // リクエストパラメータの取得
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("userName");
        String pizza1 = request.getParameter("pizza1");
        String pizza2 = request.getParameter("pizza2");
        String pizza3 = request.getParameter("pizza3");
        String pizza4 = request.getParameter("pizza4");
        String pizza5 = request.getParameter("pizza5");
        String pizza6 = request.getParameter("pizza6");
        //long id = Long.parseLong(request.getParameter("id"));
        
          Pattern pattern = Pattern.compile(".*"+"[0-9]"+".*");
          
        if (pizza1 != null && pizza1.length() != 0 && pizza2 != null && pizza2.length() != 0 && pizza3 != null && pizza3.length() != 0&& pizza4 != null && pizza4.length() != 0
                && pizza5 != null && pizza5.length() != 0&& pizza6 != null && pizza6.length() != 0) {
        	int sum = Integer.parseInt(pizza1)*1500 + Integer.parseInt(pizza2)*2300 + 
        			Integer.parseInt(pizza3)*2700 + Integer.parseInt(pizza4)*3000 + 
        			Integer.parseInt(pizza5)*3500 + Integer.parseInt(pizza6)*3200 ;
            
        	Pizza data = new Pizza(userName,Integer.parseInt(pizza1),Integer.parseInt(pizza2),Integer.parseInt(pizza3),Integer.parseInt(pizza4),Integer.parseInt(pizza5),Integer.parseInt(pizza6),sum);
            PersistenceManagerFactory factory = PMF.get();
            PersistenceManager manager = factory.getPersistenceManager();
            try{
            	manager.makePersistent(data);
            } finally{
            	manager.close();
            }

            response.sendRedirect("/complete.jsp");
        
        }else if(!(pattern.matcher(pizza1).matches()) || !pattern.matcher(pizza2).matches() || !pattern.matcher(pizza3).matches()
                || !pattern.matcher(pizza4).matches()|| !pattern.matcher(pizza5).matches()|| !pattern.matcher(pizza6).matches()){
            request.setAttribute("errorMsg", "半角数字で枚数を入力してください!!");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/order.jsp");
            dispatcher.forward(request, response);
        }
    }
}

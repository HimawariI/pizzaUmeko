package servlet;

import java.io.IOException;

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

import model.KeisanLogic;
/*import model.Account;
import model.KeisanLogic;*/
import model.Pizza;
//import model.PostCookLogic;



@SuppressWarnings("serial")
public class PizzashopGaeServlet extends HttpServlet  {
	 private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		/*RequestDispatcher dispatcher =
                request.getRequestDispatcher("/WEB-INF/jsp/order.jsp");
        dispatcher.forward(request, response);*/
		response.sendRedirect("/order.jsp");
	}
	
	
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // リクエストパラメータの取得
        request.setCharacterEncoding("UTF-8");
        String pizza1 = request.getParameter("pizza1");
        String pizza2 = request.getParameter("pizza2");
        String pizza3 = request.getParameter("pizza3");
        String pizza4 = request.getParameter("pizza4");
        String pizza5 = request.getParameter("pizza5");
        String pizza6 = request.getParameter("pizza6");
        
          Pattern pattern = Pattern.compile(".*"+"[0-9]"+".*");
          
        if (pizza1 != null && pizza1.length() != 0 && pizza2 != null && pizza2.length() != 0 && pizza3 != null && pizza3.length() != 0&& pizza4 != null && pizza4.length() != 0
                && pizza5 != null && pizza5.length() != 0&& pizza6 != null && pizza6.length() != 0) {

            Pizza pizza = new Pizza();
            pizza.setPizza1(Integer.parseInt(pizza1));
            pizza.setPizza2(Integer.parseInt(pizza2));
            pizza.setPizza3(Integer.parseInt(pizza3));
            pizza.setPizza4(Integer.parseInt(pizza4));
            pizza.setPizza5(Integer.parseInt(pizza5));
            pizza.setPizza6(Integer.parseInt(pizza6));
            
            KeisanLogic keisanLogic = new KeisanLogic();
            //PostCookLogic postCookLogic = new PostCookLogic();
            keisanLogic.execute(pizza);
            //postCookLogic.execute(pizza);
            HttpSession session = request.getSession();
            session.setAttribute("pizza", pizza);
           

         
            /*RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/check.jsp");
            dispatcher.forward(request, response);*/
            response.sendRedirect("/check.jsp");
        
        }else if(!(pattern.matcher(pizza1).matches()) || !pattern.matcher(pizza2).matches() || !pattern.matcher(pizza3).matches()
                || !pattern.matcher(pizza4).matches()|| !pattern.matcher(pizza5).matches()|| !pattern.matcher(pizza6).matches()){
            request.setAttribute("errorMsg", "半角数字で枚数を入力してください!!");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/order.jsp");
            dispatcher.forward(request, response);
        }else{
            
        }
    }
}

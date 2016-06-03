
<%@page import="model.Pizza"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
//リクエストスコープに保存されたインスタンス取得
    Pizza pizza = (Pizza) session.getAttribute("pizza");
 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>うめこおばさんのピザ</title>
    </head>
       <body bgcolor ="tomato">
        <font face="HG丸ｺﾞｼｯｸM-PRO" color ="cornsilk"> 
        <h1>注文確認</h1>
        <table>
            <tr><td>マルゲリータ</td><td>:<%=pizza.getPizza1()%>枚</td></tr>
            <tr><td>照り焼きチキン</td><td>:<%= pizza.getPizza2()%>枚</td></tr>
            <tr><td>シーフード</td><td>:<%= pizza.getPizza3()%>枚</td></tr>
            <tr><td>チーズスペシャル</td><td>:<%= pizza.getPizza4()%>枚</td></tr>
            <tr><td>ウメコデラックス</td><td>:<%= pizza.getPizza5()%>枚</td></tr>
            <tr><td>うめこおばさんの気まぐれピザ</td><td>:<%= pizza.getPizza6()%>枚</td></tr>
        </table>
        <p></p>
        <h2>合計金額 :<%= pizza.getSum()%>円</h2><br>

       
        <a href="/order">注文</a>
        <a href="/pizzashopgae">戻る</a>
        </font>
    </body>
</html>

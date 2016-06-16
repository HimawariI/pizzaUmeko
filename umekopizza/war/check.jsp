<%@page import="servlet.Pizza"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>うめこおばさんのピザ</title>
        <script type = "text/javascript" src ="lib2.js"></script>
        <script type ="text/javascript">
        <!--
            function initial(){
            var datas = getQuery();
            getData(datas.id);
        }
         
        function callback(request){
            var arr = eval(request.responseText);
            var data = arr[0];
            var msg = '<tr><td>' + data.userName + '</td></tr>';
            msg += '<tr><td>' + data.pizza1 + '</td></tr>';
            msg += '<tr><td>' + data.pizza2 + '</td></tr>';
            msg += '<tr><td>' + data.pizza3 + '</td></tr>';
            msg += '<tr><td>' + data.pizza4 + '</td></tr>';
            msg += '<tr><td>' + data.pizza5 + '</td></tr>';
            msg += '<tr><td>' + data.pizza6 + '</td></tr></table>';
            msg += '<tr><td>' + data.sum + '</td></tr>';	
            document.getElementById("data").innerHTML = msg;
        }
        //-->
        </script>
    </head>
       <body bgcolor ="tomato" onload ="initial();">
        <font face="HG丸ｺﾞｼｯｸM-PRO" color ="cornsilk"> 
        <h1>注文確認</h1>
        <div>注文内容を確認のうえ、よろしかったら注文を押してください。</div>
        <table id="data" border="1">
 　　　	<tr>
        <td>wait...</td>
     	 </tr>
  	  </table>
        <a href="/order">注文</a>
        <a href="/pizzashopgae">戻る</a>
        </font>
    </body>
</html>

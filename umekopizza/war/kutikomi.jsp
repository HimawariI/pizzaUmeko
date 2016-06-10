
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <script type="text/javascript" src="lib.js"></script>
        <script type="text/javascript">
        <!--
        function callback(request){
            var json = eval(request.responseText);
            var res = '';
            if (json.length == 1){
                res += '<tr><td>' + json[0].id +'</td></tr>';
                res += '<tr><td>' + json[0].name +'</td></tr>';
                res += '<tr><td>' + json[0].review +'</td></tr>';
            } else {
                for (var i = 0;i < json.length;i++){
                    res += '<tr><td>' + (i+1) + '</td>';
                    res += '<td>' + json[i].name + '</td>' +
                    '<td>' + json[i].review + '</td>' +
                    '<td><a href="edit.html?id=' + json[i].id + '">Edit</td>' +
                    '<td><a href="del.html?id=' + json[i].id + '">Delete</td></tr>';
                }
            }
            var obj = document.getElementById("datatable");
            obj.innerHTML = res;
        }
        //-->
        </script>
	
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>うめこおばさんのピザ</title>
    </head>
  <body bgcolor="tomato"  onload="getData(null);">

    <font face="HG丸ｺﾞｼｯｸM-PRO" color ="cornsilk">
      <h1>口コミ投稿</h1>

      <font face="HG丸ｺﾞｼｯｸM-PRO" size="3" color ="cornsilk">
        <p>
        <p>あなたのご意見やご感想を教えてください</p>
        <a href="/loginOK.jsp">トップへ</a>
    </p>
    <!--<p><a href="/kutikomi">更新</a></p>-->
    <form action="/add" method="post">
        <p>ニックネーム:<input type="text" name="name"></p>
        <p><textarea name="review" cols="40" rows="10"></textarea></p>
        <input type="submit" value="投稿">
    </form>

      <table id="datatable" border="1">
 　　　<tr>
        <td>wait...</td>
      </tr>
    </table>
  
  </body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>うめこおばさんのピザ</title>
        <script type="text/javascript" src="lib.js"></script>
        <script type="text/javascript">
        <!--
        function callback(request){
            var json = eval(request.responseText);
            var res = '';
            res += '<tr style="color:#FFFFFF"><td width ="200">日付</td><td width ="100">ニックネーム</td><td width="400">レビュー</td><td width ="50">編集</td><td width ="50">削除</td></tr>'
            for (var i = 0;i < json.length;i++){
                  res += '<td width ="200">' + json[i].datetime + '</td>';
                  res += '<td width ="100">' + json[i].name + '</td>' +
                  '<td width="400">' + json[i].review + '</td>' +
                  '<td width ="50"><a href="edit.html?id=' + json[i].id + '">Edit</td>' +
                  '<td width ="50"><a href="del.html?id=' + json[i].id + '">Delete</td></tr>';
              }
            var obj = document.getElementById("datatable");
            obj.innerHTML = res;
        }
        //-->
        </script>
    </head>
  <body bgcolor="tomato" onload="getData(null);">

    <font face="HG丸ｺﾞｼｯｸM-PRO" color ="cornsilk">
      <h1>口コミ投稿</h1>

      <font face="HG丸ｺﾞｼｯｸM-PRO" size="3" color ="cornsilk">
        <p>
        <p>あなたのご意見やご感想を教えてください</p>
        <p><a href="/index.html">トップへ</a>　　<a href="/kutikomi">更新</a></p>
    <form action="/add" method="post">
        <p>ニックネーム:<input type="text" name="name"></p>
        <p>レビュー:</p>
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

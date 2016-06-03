

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String errorMsg = (String) request.getAttribute("errorMsg");%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>うめこおばさんのピザ</title>
    </head>
    <body bgcolor ="tomato">
        <font face="HG丸ｺﾞｼｯｸM-PRO" color ="cornsilk"> 
        <h1>注文画面</h1>
        <font face="HG丸ｺﾞｼｯｸM-PRO" color ="cornsilk"> 
        <p>注文したいピザの枚数を半角数字で入力してください。</p>
        <form action="/pizzashopgae" method="post">
            <font face="HG丸ｺﾞｼｯｸM-PRO" color ="black">
            <h2>
        <% if (errorMsg != null) {%>
        <p><%= errorMsg%></p>
        <% }%></h2></font>
            <table>
                <tr><td>マルゲリータ  1500円<br>
                        <img src="maruge.jpg" width="200" height="150"></td>
                    <td>
                        <pre>定番のピザ。食材にこだわりを持つうめこおばさんは、産地直送の新鮮なトマトと
バジル、北海道産のモッツァレラチーズをふんだんに使い、本場イタリアのマルゲ
リータの味に仕上げました。
                        </pre>
                    </td>
                </tr>
                <tr><td>照り焼きチキン  2300円<br>
                        <img src="teriyaki.jpg" width="200" height="150"></td>
                    <td>
                        <pre>
照り焼きチキンが大好きなうめこおばさんが考えた、元祖照り焼きチキンピザ。
鹿児島県産の鶏肉を使い、うめこおばさん特製のたれで味付けをした照り焼き
チキンは大人も子どもも大好きな味。
                        </pre></td>
                </tr>
                <tr><td>シーフード  2700円<br>
                        <img src="seafood.jpg" width="200" height="150"></td>
                <td>
                    <pre>
うめこおばさんが朝から早起きをして、築地から仕入れた新鮮な魚介類を
使ったこだわりの一品。カニ、エビ、ホタテなど最高ランクの魚介を
ぜいたくにトッピングしました。
                    </pre></td></tr>
                <tr><td>チーズスペシャル  3000円<br>
                        <img src="cheese.jpg" width="200" height="150"></td>
                <td><pre>
ゴーダ、モッツァレラ、クリーム、パルメザン、ゴルゴンゾーラの
5種類のチーズをたっぷりと使ったチーズ好きにはたまらないピザ。
別添のルーマニア産熟成アカシア蜂蜜をお好みで。
                    </pre></td></tr>
                <tr><td>ウメコデラックス　　3500円<br>
                        <img src="DX.jpg" width="200" height="150"></td>
                <td><pre>
うめこおばさんが留学中にアメリカのピザ屋でインスパイアされ
生まれたピザ。いろんな味が1枚のピザで味わえる、まさに
デラックスなピザ。パーティにどうぞ。
                    </pre></td></tr>
                <tr><td>うめこおばさんの気まぐれピザ  3200円<br>
                        <img src="kimagure.jpg" width="200" height="150"></td>
                <td><pre>
うめこおばさんの気まぐれで、毎日トッピングが変わるピザ。
どんなピザなのかは届いてからのおたのしみ。
絶対に満足のいくピザであることを保障します。
                    </pre></td></tr>
            </table>
            <table>
                <tr><td>マルゲリータ:</td><td><input type="text" name="pizza1">枚×1500円</td></tr>
                <tr><td>照り焼きチキン:</td><td><input type="text" name="pizza2">枚×2300円</td></tr>
                <tr><td>シーフード:</td><td><input type="text" name="pizza3">枚×2700円</td></tr>
                <tr><td>チーズスペシャル:</td><td><input type="text" name="pizza4">枚×3000円</td></tr>
                <tr><td>ウメコデラックス:</td><td><input type="text" name="pizza5">枚×3500円</td></tr>
                <tr><td>うめこおばさんの気まぐれピザ:</td><td><input type="text" name="pizza6">枚×3200円</td></tr>
            </table>


            <input type="submit" value="注文確認">
        </form>
       



        </font>
    </body>

</html>

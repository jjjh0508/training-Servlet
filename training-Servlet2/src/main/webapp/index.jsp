<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>민영이네 떡볶이</title>
</head>
<body>
<h1>떡볶이 주문</h1>
<br/>
<form action="/tteokbokki" method="post">
    <label>주문자 명 :</label>
    <input type="text" name="name">
    <br/>
    <label>떡볶이 종류 선택</label>
    <input type="radio" name="kind" id="general" value="일반떡볶이"> <label for="general">일반 떡볶이</label>
    <input type="radio" name="kind" id="rose" value="로제떡볶이"> <label for="rose">로제 떡볶이</label>
    <input type="radio" name="kind" id="jajang" value="짜장떡볶이"> <label for="jajang">짜장 떡볶이</label>
    <br/>
    <label>떡볶이 맵기 선택</label>
    <input type="radio" name="spicy" id="spicygeneral" value="일반맵기"><label for="spicygeneral">일반맵기</label>
    <input type="radio" name="spicy" id="spicymedium" value="중간맵기"><label for="spicymedium">중간맵기</label>
    <input type="radio" name="spicy" id="spicytop" value="최강"><label for="spicytop">최강</label>
    <br/>
    <!--체크 박스로 바꾸기-->
    <label>떡볶이 토핑 선택</label>
    <input type="checkbox" name="topping" id="chinese" value="중국당면"><label for="chinese">중국당면</label>
    <input type="checkbox" name="topping" id="dumpling" value="바싹치즈만두"><label for="dumpling">바싹치즈만두</label>
    <input type="checkbox" name="topping" id="gimmari" value="김말이"><label for="gimmari">김말이</label>
    <input type="checkbox" name="topping" id="riceball" value="주먹밥"><label for="riceball">주먹밥</label>
    <br/>
    <label>주문지 주소</label>
    <input type="text" name="addr">
    <input type="submit" value="주문하기">
    <br/>
    <a href="tteokbokki" >치킨 주문</a>



</form>
</body>
</html>
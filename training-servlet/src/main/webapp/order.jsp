<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<br/>
<form action="order" method="get">
    <label>점심메뉴</label>
    <br/>
    <input type="radio" name="menu" id="ramen" value="라면"><label for="ramen">라면</label>
    <input type="radio" name="menu" id="kimchi" value="김치찌개"><label for="kimchi">김치찌개</label>
    <input type="radio" name="menu" id="sushi" value="스시"><label for="sushi">스시</label>
    <input type="radio" name="menu" id="sashimi" value="회"><label for="sashimi">회</label>
    <input type="radio" name="menu" id="donkatu" value="돈가스"><label for="donkatu">돈가스</label>
    <br/>
    <label>수량</label>
    <input type="number" name="amount">
    <input type="submit" value="주문하기">

</form>

</body>
</html>


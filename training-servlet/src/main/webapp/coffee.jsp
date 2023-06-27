<%--
  Created by IntelliJ IDEA.
  User: jjjh0
  Date: 2023-06-27
  Time: 오후 5:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/coffee" method="post">
    <label>상스커피</label>
    <br/>
    <select name="coffee">
        <option value="아메리카노">아메리카노</option>
        <option value="김치라떼">김치라떼</option>
        <option value="오징어스무디">오징어스무디</option>
        <option value="커피라떼">커피라떼</option>
        <option value="딸기스무디">딸기라떼</option>
    </select>

    <br/>

    <input type="number" name="amount">
    <input type="submit" value="커피주문하기">
</form>

</body>
</html>

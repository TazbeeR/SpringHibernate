<%--
  Created by IntelliJ IDEA.
  User: tazbeer
  Date: 01.09.2021
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Zgadnij jaka to liczba</title>
</head>
<body>

<form action="/guess" method="get">
    <label>Podaj liczbę</label>
    <input name="find" type="number" min="1" max="10">
    <input type="submit" value="To będzie ta !!">

</form>
</body>
</html>

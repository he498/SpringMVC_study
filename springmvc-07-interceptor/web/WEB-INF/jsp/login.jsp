<%--
  Created by IntelliJ IDEA.
  User: Ming
  Date: 2021/12/22
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="get">
    username:<input type="text" name="username">
    password:<input type="text" name="password">
    <input type="submit">
</form>
</body>
</html>

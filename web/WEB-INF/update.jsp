<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/5/11
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
pageContext.setAttribute("stp",request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${ctp}/update">
    <input type="hidden" value="1"><br>
    name:张三<br>
    password:<input type="text" name="password"><br>
    age:<input type="text" name="age"><br>
    <input type="submit" value="更新"><br>
</form>
</body>
</html>

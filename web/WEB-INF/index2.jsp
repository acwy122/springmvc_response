<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/5/14
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
pageContext.setAttribute("ctp",request.getContextPath());
%>
<html>
<head>
    <title></title>
</head>
<body>
6666666
<form action="${ctp}/testDateConverter" method="post">
    id:<input type="text" name="id"><br>
    name:<input type="text" name="name"><br>
    age:<input type="text" name="age"><br>
    password:<input type="text" name="password"><br>
    birth:<input type="text" name="birth"><br>
    <input type="submit" value="提交"><br>
</form>
</body>
</html>

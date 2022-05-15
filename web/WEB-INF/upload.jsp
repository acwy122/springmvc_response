<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/5/15
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
pageContext.setAttribute("ctp",request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${ctp}/upload" method="post" enctype="multipart/form-data">

    描述：<input type="text" name="desc"><br>
    文件：<input type="file" name="file"><br>
    <input type="submit" value="提交"><br>
</form>
</body>
</html>

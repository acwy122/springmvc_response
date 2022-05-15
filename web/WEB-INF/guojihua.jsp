<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/5/15
  Time: 16:08
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
<a href="${ctp}/i18n">国际化页面</a>
</body>
</html>

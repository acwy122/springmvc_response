<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/5/11
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎<br>
${msg}<br>
page:${pageScope.msg}<br>
request:${requestScope.msg}<br>
session:${sessionScope.msg}<br>
application:${applicationScope.msg}<br>
<hr/>
session:${sessionScope.username}<br>
request:${requestScope.username}<br>
</body>
</html>

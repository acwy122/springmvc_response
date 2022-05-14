<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/5/14
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
pageContext.setAttribute("ctp",request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<form action="/validation" method="post">
编号：<input type="text" name="id">${error.id}<br>
姓名：<input type="text" name="name">${error.name}<br>
年龄：<input type="text" name="age">${error.age}<br>
性别：<input type="text" name="gender">${error.gender}<br>
生日：<input type="text" name="birth">${error.birth}<br>
邮箱：<input type="text" name="email">${error.email}<br>
提交：<input type="submit" value="提交"><br>
</form>--%>

<form action="${ctp}/validation" method="post">

编号：<form:input path="id"></form:input><form:errors path="id"></form:errors> <br>
姓名：<form:input path="name"></form:input><form:errors path="id"></form:errors><br>
年龄：<form:input path="age"></form:input><form:errors path="id"></form:errors><br>
性别：<form:input path="gender"></form:input><form:errors path="id"></form:errors><br>
生日：<form:input path="birth"></form:input><form:errors path="id"></form:errors><br>
邮箱：<form:input path="email"></form:input><form:errors path="id"></form:errors><br>
    提交：<input type="submit" value="提交">

</form>


</body>
</html>

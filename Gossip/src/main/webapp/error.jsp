<%@ page import="java.util.List" %>
<%--
  User: Hao HOU
  Date: 2017/7/25
  Time: 21:27
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增会员失败</title>
</head>
<body>
<h1>新增会员失败</h1>
<ul style="color: rgb(233, 0, 0)">
    <%
        List<String> errors = (List<String>) request.getAttribute("errors");
        for (String error : errors) {
    %>
    <li><%= error %></li>
    <%
        }
    %>
</ul>
<a href="register.html">返回注册页面</a>
</body>
</html>

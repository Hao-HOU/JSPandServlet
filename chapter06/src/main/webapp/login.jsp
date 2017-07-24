<%--
  User: Hao HOU
  Date: 2017/7/24
  Time: 8:32
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    String name = "hao";
    String password = "123";
    boolean checkUser(String name, String password) {
        return this.name.equals(name) &&
                this.password.equals(password);
    }
%>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    if (checkUser(name, password)) {
%>
<h1><%= name %> 登录成功</h1>
<%
    } else {
%>
<h1>登录失败</h1>
<%
    }
%>
</body>
</html>

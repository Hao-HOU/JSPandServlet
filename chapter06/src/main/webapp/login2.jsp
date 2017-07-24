<%--
  User: Hao HOU
  Date: 2017/7/24
  Time: 9:21
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="user" class="com.acehouhao.User"/>
<jsp:setProperty name="user" property="*"/>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<%
    if (user.isValid()) {
%>
<h1><jsp:getProperty name="user" property="name"/> 登录成功</h1>
<%
    } else {
%>
<h1>登录失败</h1>
<%
    }
%>
</body>
</html>

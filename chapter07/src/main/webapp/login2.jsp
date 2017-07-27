<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: Hao HOU
  Date: 2017/7/26
  Time: 17:23
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<jsp:useBean id="user" class="com.acehouhao.User"/>
<jsp:setProperty name="user" property="*"/>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<c:choose>
    <c:when test="${ user.valid }">
        <h1><jsp:getProperty name="user" property="name"/> 登录成功</h1>
    </c:when>
    <c:otherwise>
        <h1>登录失败</h1>
    </c:otherwise>
</c:choose>
</body>
</html>

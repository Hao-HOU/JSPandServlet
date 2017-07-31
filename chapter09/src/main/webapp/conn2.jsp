<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: Hao HOU
  Date: 2017/7/30
  Time: 14:42
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<jsp:useBean id="db" class="com.acehouhao.DatabaseBean"/>
<html>
<head>
    <title>测试数据库连接</title>
</head>
<body>
<c:choose>
    <c:when test="${ db.connectedOK }">连接成功！</c:when>
    <c:otherwise>连接失败！</c:otherwise>
</c:choose>
</body>
</html>

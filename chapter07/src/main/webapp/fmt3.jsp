<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  User: Hao HOU
  Date: 2017/7/27
  Time: 9:26
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<jsp:useBean id="now" class="java.util.Date"/>
<fmt:setBundle basename="messages3"/>
<html>
<head>
    <title><fmt:message key="title" /></title>
</head>
<body>
<fmt:message key="forUser">
    <fmt:param value="${ param.username }"/>
    <fmt:param value="${ now }"/>
    <fmt:param value="${ now }"/>
</fmt:message>
</body>
</html>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  User: Hao HOU
  Date: 2017/7/27
  Time: 9:20
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<fmt:setBundle basename="messages1"/>
<html>
<head>
    <title><fmt:message key="title" /></title>
</head>
<body>
<h1><fmt:message key="forGuest" /></h1>
<fmt:bundle basename="messages2">
    <h1><fmt:message key="forGuest" /></h1>
</fmt:bundle>
</body>
</html>

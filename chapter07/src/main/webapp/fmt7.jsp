<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  User: Hao HOU
  Date: 2017/7/27
  Time: 10:43
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<jsp:useBean id="now" class="java.util.Date"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fmt:formatDate value="${ now }"/><br/>
<fmt:formatDate value="${ now }" dateStyle="full"/><br/>
<fmt:formatDate value="${ now }" type="time" timeStyle="full"/><br/>
<fmt:formatDate value="${ now }" pattern="dd.MM.yy"/><br/>
<fmt:timeZone value="GMT+1:00">
    <fmt:formatDate value="${ now }" type="both" dateStyle="full" timeStyle="full"/><br/>
</fmt:timeZone>
</body>
</html>

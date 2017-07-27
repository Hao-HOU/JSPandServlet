<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: Hao HOU
  Date: 2017/7/26
  Time: 17:51
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>加法网页</title>
</head>
<body>
<c:catch var="error">
    ${ param.a } / ${ param.b } = ${ param.a / param.b }
</c:catch>
<c:if test="${ error } != null">
    <br/><span style="color: red;">${ error.message }</span>
    <br/>${ error }
</c:if>
</body>
</html>

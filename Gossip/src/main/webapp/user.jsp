<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="acehouhao" tagdir="/WEB-INF/tags" %>
<%--
  User: Hao HOU
  Date: 2017/7/26
  Time: 11:01
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta content='text/html;charset=UTF-8' http-equiv='content-type'>
    <title>Gossip 微博</title>
    <link rel="stylesheet" href="../css/member.css" type="text/css">
</head>
<body>
<c:choose>
    <c:when test="${ requestScope.blahs != null }">
        <div class="leftPanel">
            <img src="../images/caterpillar.jpg" alt="Gossip 微博"/><br/><br/>
            ${ requestScope.username }的微博
        </div>
        <acehouhao:Blahs/>
        <hr style="width: 100%; height: 1px;"/>
    </c:when>
    <c:otherwise>
        <h1 style="color: rgb(255, 0, 0);">${ requestScope.username } 用户不存在！</h1>
    </c:otherwise>
</c:choose>
</body>
</html>

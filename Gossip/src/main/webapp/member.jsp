<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  User: Hao HOU
  Date: 2017/7/25
  Time: 21:30
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Gossip 微博</title>
    <link rel="stylesheet" href="css/member.css" type="text/css"/>
</head>
<body>
<div class="leftPanel">
    <img src="images/caterpillar.jpg" alt="Gossip 微博"/>
    <br/><br/>
    <a href="logout.do?username=${ sessionScope.login }">注销 ${ sessionScope.login }</a>
</div>
<form method="post" action="message.do">
    分享新鲜事...<br/>
    <c:if test="${ requestScope.blabla != null }">
        信息要在 140 字以内！<br/>
    </c:if>
    <textarea cols="60" rows="4" name="blabla">${ requestScope.blabla }</textarea><br/>
    <button type="submit">发布</button>
</form>
<table style="text-align: left; width: 510px; height: 88px;" border="0" cellpadding="2" cellspacing="2">
    <thead>
    <tr>
        <th>
            <hr/>
        </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="blah" items="${ requestScope.blahs }">
        <tr>
            <td style="vertical-align: top;">
                ${ blah.username }<br/>
                <c:out value="${ blah.txt }"/><br/>
                <fmt:formatDate value="${ blah.date }" type="both" dateStyle="full" timeStyle="full"/>
                <a href="delete.do?message=${ blah.date.time }">删除</a>
                <hr/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<hr style="width: 100%; height: 1px;"/>
</body>
</html>

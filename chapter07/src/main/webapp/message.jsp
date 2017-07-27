<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: Hao HOU
  Date: 2017/7/26
  Time: 17:36
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<jsp:useBean id="messageService" class="com.acehouhao.MessageService"/>
<html>
<head>
    <title>留言板</title>
</head>
<body>
<table style="text-align: left; width: 100%" border="1">
    <tr>
        <td>名称</td><td>信息</td>
    </tr>
    <c:forEach var="message" items="${ messageService.fakeMessages }">
        <tr>
            <td>${ message.name }</td><td>${ message.text }</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

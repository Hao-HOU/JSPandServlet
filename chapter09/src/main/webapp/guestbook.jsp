<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: Hao HOU
  Date: 2017/7/29
  Time: 16:52
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<c:set target="${ pageContext.request }" property="characterEncoding" value="UTF-8"/>
<jsp:useBean id="guestBook" class="com.acehouhao.GuestBookBean" scope="application"/>
<c:if test="${ param.msg != null}">
    <jsp:useBean id="newMessage" class="com.acehouhao.Message"/>
    <jsp:setProperty name="newMessage" property="*"/>
    <c:set target="${ guestBook }" property="message" value="${ newMessage }"/>
</c:if>
<html>
<head>
    <title>访客留言板</title>
</head>
<body>
<table style="text-align: left; width: 100%;" border="0" cellpadding="2" cellspacing="2">
    <tbody>
    <c:forEach var="message" items="${ guestBook.messages }">
        <tr>
            <td>${ message.name }</td>
            <td>${ message.email }</td>
            <td>${ message.msg }</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: Hao HOU
  Date: 2017/7/27
  Time: 8:28
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<c:set target="${ pageContext.request }" property="characterEncoding" value="UTF-8"/>
<html>
<head>
    <title>Questionnaire</title>
</head>
<body>
<form action="question.jsp" method="post">
    <c:choose>
        <c:when test="${ param.page == 'page1' }">
            问题一：<input type="text" name="p1q1"/><br/>
            问题二：<input type="text" name="p1q2"/><br/>
            <input type="submit" name="page" value="page2"/>
        </c:when>
        <c:when test="${ param.page == 'page2' }">
            <c:set var="p1q1" value="${ param.p1q1 }" scope="session"/>
            <c:set var="p1q2" value="${ param.p1q2 }" scope="session"/>
            问题三：<input type="text" name="p2q1"/><br/>
            <input type="submit" name="page" value="finish"/>
        </c:when>
        <c:when test="${ param.page == 'finish'}">
            ${ sessionScope.p1q1 }<br/>
            ${ sessionScope.p1q2 }<br/>
            ${ param.p2q1 }<br/>
        </c:when>
    </c:choose>
</form>
</body>
</html>
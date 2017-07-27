<%--
  User: Hao HOU
  Date: 2017/7/27
  Time: 15:40
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
    <c:when test="${ fn:startsWith(param.text, 'ace')}">
        ${ fn:replace(param.text, 'ace', 'SSS') }
    </c:when>
    <c:otherwise>
        ${ param.text }
    </c:otherwise>
</c:choose>
</body>
</html>

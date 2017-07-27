<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: Hao HOU
  Date: 2017/7/26
  Time: 17:16
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<c:if test="${ param.name == 'momor' && param.password == '123'}">
    <h1>${ param.name } 登录成功</h1>
</c:if>
</body>
</html>

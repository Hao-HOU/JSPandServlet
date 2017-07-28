<%@ taglib prefix="f" uri="http://acehouhao.com/jstl/fake" %>
<%--
  User: Hao HOU
  Date: 2017/7/28
  Time: 11:46
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<jsp:useBean id="user" class="com.acehouhao.tag.User"/>
<jsp:setProperty name="user" property="*"/>
<html>
<head>
    <title>登录</title>
</head>
<body>
<f:choose>
    <f:when test="${ user.valid }">
        <h1>${ user.name }登录成功</h1>
    </f:when>
    <f:otherwise>
        <h1>登录失败</h1>
    </f:otherwise>
</f:choose>
</body>
</html>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  User: Hao HOU
  Date: 2017/7/27
  Time: 11:03
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<jsp:useBean id="now" class="java.util.Date"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fmt:setLocale value="zh_CN"/>
<fmt:formatDate value="${ now }" type="both"/><br/>
<fmt:formatNumber value="12345.678" type="currency"/><br/>

<fmt:setLocale value="en_US"/>
<fmt:formatDate value="${ now }" type="both"/><br/>
<fmt:formatNumber value="12345.678" type="currency"/><br/>

<fmt:setLocale value="ja_JP"/>
<fmt:formatDate value="${ now }" type="both"/><br/>
<fmt:formatNumber value="12345.678" type="currency"/><br/>
</body>
</html>

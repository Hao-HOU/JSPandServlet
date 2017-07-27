<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  User: Hao HOU
  Date: 2017/7/27
  Time: 10:56
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fmt:formatNumber value="12345.678"/><br/>
<fmt:formatNumber value="12345.678" type="currency"/><br/>
<fmt:formatNumber value="12345.678" type="currency" currencySymbol="人民币"/><br/>
<fmt:formatNumber value="12345.678" type="percent"/><br/>
<fmt:formatNumber value="12345.678" pattern="#,#00.0#"/><br/>
</body>
</html>

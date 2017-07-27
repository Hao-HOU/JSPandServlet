<%--
  User: Hao HOU
  Date: 2017/7/27
  Time: 15:36
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
参数：${ param.text }<br/>
长度：${ fn:length(param.text) }
</body>
</html>

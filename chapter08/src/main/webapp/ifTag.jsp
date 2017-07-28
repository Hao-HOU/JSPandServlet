<%@ taglib prefix="f" uri="http://acehouhao.com/jstl/fake" %>
<%--
  User: Hao HOU
  Date: 2017/7/28
  Time: 8:40
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>自定义 if 标签</title>
</head>
<body>
<f:if test="${ param.password == '123456'}">
    你的秘密数据在此！
</f:if>
</body>
</html>
